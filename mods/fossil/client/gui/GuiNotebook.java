package mods.fossil.client.gui;
/*
import java.awt.image.BufferedImage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.entity.EntityDinoEgg;
import mods.fossil.entity.mob.EntityDinosaur;
import mods.fossil.entity.mob.EntityDodo;
import mods.fossil.entity.mob.EntityMammoth;
import mods.fossil.entity.mob.EntityPregnantCow;
import mods.fossil.entity.mob.EntityPregnantPig;
import mods.fossil.entity.mob.EntityPregnantSheep;
import mods.fossil.entity.mob.EntitySmilodon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@SideOnly(Side.CLIENT)
public class GuiNotebook extends GuiContainer
{
 
	private static final ResourceLocation loc = new ResourceLocation("fossil:textures/gui/Arch_Notebook.png");
	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 88;
	
    public GuiNotebook()
    {
        super(new ContainerNotebook());
        this.xSize = 254;
        this.ySize = 188;
    }
	
    
    public void initGui()
    {
    this.buttonList.clear();

    int posX = (this.width - xSizeOfTexture) / 2;
    int posY = (this.height - ySizeOfTexture) / 2;

    this.buttonList.add(new GuiButton(0, posX+ 40, posY + 40, 100, 20, "no use"));
    }
    
    
    @Override
    public boolean doesGuiPauseGame()
    {
    return false;
    }
    

    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(loc);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }
	
}
*/
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiNotebook extends GuiScreen
{
	private static final ResourceLocation bookGuiTextures = new ResourceLocation("fossil:textures/gui/Arch_Notebook.png");


    /** Update ticks since the gui was opened */
    private int updateCount;
    private int bookImageWidth = 254;
    private int bookImageHeight = 188;
    private int bookTotalPages = 5;
    private int currPage;
    private NBTTagList bookPages;
    private String bookTitle = "";
    private FossilGuiButtonNextPage buttonNextPage;
    private FossilGuiButtonNextPage buttonPreviousPage;
    private GuiButton buttonDone;

    /** The GuiButton to sign this book. */
    private GuiButton buttonSign;
    private GuiButton buttonFinalize;
    private GuiButton buttonCancel;

    public GuiNotebook()
    {

        if (this.bookPages == null)
        {
            this.bookPages = new NBTTagList("pages");
            this.bookPages.appendTag(new NBTTagString("1", ""));
            this.bookTotalPages = 2;
        }
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();
        ++this.updateCount;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents(true);

            this.buttonList.add(this.buttonDone = new GuiButton(0, this.width / 2 - 100, 4 + this.bookImageHeight, 200, 20, I18n.getString("gui.done")));

        int i = (this.width - this.bookImageWidth) / 2;
        byte b0 = 2;
        this.buttonList.add(this.buttonNextPage = new FossilGuiButtonNextPage(1, i + 120, b0 + 154, true));
        this.buttonList.add(this.buttonPreviousPage = new FossilGuiButtonNextPage(2, i + 38, b0 + 154, false));
        this.updateButtons();
    }

    /**
     * Called when the screen is unloaded. Used to disable keyboard repeat events
     */
    public void onGuiClosed()
    {
        Keyboard.enableRepeatEvents(false);
    }

    private void updateButtons()
    {
        this.buttonNextPage.drawButton = (this.currPage < this.bookTotalPages - 1);
        this.buttonPreviousPage.drawButton = this.currPage > 0;
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    protected void actionPerformed(GuiButton par1GuiButton)
    {
        if (par1GuiButton.enabled)
        {
            if (par1GuiButton.id == 0)
            {
                this.mc.displayGuiScreen((GuiScreen)null);
            }
            else if (par1GuiButton.id == 1)
            {
                if (this.currPage < this.bookTotalPages - 1)
                {
                    ++this.currPage;
                }
            }
            else if (par1GuiButton.id == 2)
            {
                if (this.currPage > 0)
                {
                    --this.currPage;
                }
            }

            this.updateButtons();
        }
    }

    private void addNewPage()
    {
        if (this.bookPages != null && this.bookPages.tagCount() < 50)
        {
            this.bookPages.appendTag(new NBTTagString("" + (this.bookTotalPages + 1), ""));
            ++this.bookTotalPages;
        }
    }

    
    @Override
    public boolean doesGuiPauseGame()
    {
    return false;
    }
    
    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char par1, int par2)
    {
        super.keyTyped(par1, par2);
    }

    /**
     * Processes keystrokes when editing the text of a book
     */
    private void keyTypedInBook(char par1, int par2)
    {
        switch (par1)
        {
            case 22:
                this.func_74160_b(GuiScreen.getClipboardString());
                return;
            default:
                switch (par2)
                {
                    case 14:
                        String s = this.func_74158_i();

                        if (s.length() > 0)
                        {
                            this.func_74159_a(s.substring(0, s.length() - 1));
                        }

                        return;
                    case 28:
                    case 156:
                        this.func_74160_b("\n");
                        return;
                    default:
                        if (ChatAllowedCharacters.isAllowedCharacter(par1))
                        {
                            this.func_74160_b(Character.toString(par1));
                        }
                }
        }
    }

    private void func_74162_c(char par1, int par2)
    {
        switch (par2)
        {
            case 14:
                if (!this.bookTitle.isEmpty())
                {
                    this.bookTitle = this.bookTitle.substring(0, this.bookTitle.length() - 1);
                    this.updateButtons();
                }

                return;
            case 28:
            case 156:
                if (!this.bookTitle.isEmpty())
                {
                    this.mc.displayGuiScreen((GuiScreen)null);
                }

                return;
            default:
                if (this.bookTitle.length() < 16 && ChatAllowedCharacters.isAllowedCharacter(par1))
                {
                    this.bookTitle = this.bookTitle + Character.toString(par1);
                    this.updateButtons();
                }
        }
    }

    private String func_74158_i()
    {
        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
        {
            NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.currPage);
            return nbttagstring.toString();
        }
        else
        {
            return "";
        }
    }

    private void func_74159_a(String par1Str)
    {
        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
        {
            NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.currPage);
            nbttagstring.data = par1Str;
        }
    }

    private void func_74160_b(String par1Str)
    {
        String s1 = this.func_74158_i();
        String s2 = s1 + par1Str;
        int i = this.fontRenderer.splitStringWidth(s2 + "" + EnumChatFormatting.BLACK + "_", 118);

        if (i <= 118 && s2.length() < 256)
        {
            this.func_74159_a(s2);
        }
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(bookGuiTextures);
        int k = (this.width - this.bookImageWidth) / 2;
        byte b0 = 2;
        this.drawTexturedModalRect(k, b0, 0, 0, this.bookImageWidth, this.bookImageHeight);
        String s;
        String s1;
        int l;

        {
            s = String.format(I18n.getString("book.pageIndicator"), new Object[] {Integer.valueOf(this.currPage + 1), Integer.valueOf(this.bookTotalPages)});
            s1 = "";

            if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
            {
                NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.currPage);
                s1 = nbttagstring.toString();
            }

            l = this.fontRenderer.getStringWidth(s);
            this.fontRenderer.drawString(s, k - l + this.bookImageWidth - 44, b0 + 16, 0);
            this.fontRenderer.drawSplitString(s1, k + 36, b0 + 16 + 16, 116, 0);
        }

        super.drawScreen(par1, par2, par3);
    }

    static ResourceLocation func_110404_g()
    {
        return bookGuiTextures;
    }
}
