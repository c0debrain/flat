package com.cloverstudio.flat;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "flat";
    }

    public static final class BuildConfig {
      public static final boolean DEBUG = Boolean.parseBoolean("true");
      public static final String APPLICATION_ID = "com.cloverstudio.flat";
      public static final String BUILD_TYPE = "debug";
      public static final String FLAVOR = "";
      public static final int VERSION_CODE = 1;
      public static final String VERSION_NAME = "1.0";
    }

    public static final class Manifest {
        public static final class permission {
            public static final String C2D_MESSAGE="com.cloverstudio.flat.permission.C2D_MESSAGE";
        }
    }

    public static final class R {
        public static final class anim {
            public static final int abc_fade_in=0x7f050000;
            public static final int abc_fade_out=0x7f050001;
            public static final int abc_grow_fade_in_from_bottom=0x7f050002;
            public static final int abc_popup_enter=0x7f050003;
            public static final int abc_popup_exit=0x7f050004;
            public static final int abc_shrink_fade_out_from_bottom=0x7f050005;
            public static final int abc_slide_in_bottom=0x7f050006;
            public static final int abc_slide_in_top=0x7f050007;
            public static final int abc_slide_out_bottom=0x7f050008;
            public static final int abc_slide_out_top=0x7f050009;
            public static final int abc_tooltip_enter=0x7f05000a;
            public static final int abc_tooltip_exit=0x7f05000b;
            public static final int catalyst_fade_in=0x7f05000c;
            public static final int catalyst_fade_out=0x7f05000d;
            public static final int catalyst_push_up_in=0x7f05000e;
            public static final int catalyst_push_up_out=0x7f05000f;
            public static final int catalyst_slide_down=0x7f050010;
            public static final int catalyst_slide_up=0x7f050011;
            public static final int ucrop_loader_circle_path=0x7f050012;
            public static final int ucrop_loader_circle_scale=0x7f050013;
        }
        public static final class attr {
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarDivider=0x7f01004e;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarItemBackground=0x7f01004f;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarPopupTheme=0x7f010048;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>wrap_content</code></td><td>0</td><td></td></tr>
    </table>
             */
            public static final int actionBarSize=0x7f01004d;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarSplitStyle=0x7f01004a;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarStyle=0x7f010049;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarTabBarStyle=0x7f010044;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarTabStyle=0x7f010043;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarTabTextStyle=0x7f010045;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarTheme=0x7f01004b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionBarWidgetTheme=0x7f01004c;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionButtonStyle=0x7f010069;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionDropDownStyle=0x7f010065;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionLayout=0x7f010107;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionMenuTextAppearance=0x7f010050;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int actionMenuTextColor=0x7f010051;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeBackground=0x7f010054;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeCloseButtonStyle=0x7f010053;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeCloseDrawable=0x7f010056;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeCopyDrawable=0x7f010058;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeCutDrawable=0x7f010057;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeFindDrawable=0x7f01005c;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModePasteDrawable=0x7f010059;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModePopupWindowStyle=0x7f01005e;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeSelectAllDrawable=0x7f01005a;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeShareDrawable=0x7f01005b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeSplitBackground=0x7f010055;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeStyle=0x7f010052;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionModeWebSearchDrawable=0x7f01005d;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionOverflowButtonStyle=0x7f010046;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actionOverflowMenuStyle=0x7f010047;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int actionProviderClass=0x7f010109;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int actionViewClass=0x7f010108;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int activityChooserViewStyle=0x7f010071;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int actualImageResource=0x7f01012d;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
             */
            public static final int actualImageScaleType=0x7f0100e1;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int actualImageUri=0x7f01012c;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int adSize=0x7f010022;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int adSizes=0x7f010023;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int adUnitId=0x7f010024;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int alertDialogButtonGroupStyle=0x7f010096;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int alertDialogCenterButtons=0x7f010097;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int alertDialogStyle=0x7f010095;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int alertDialogTheme=0x7f010098;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int allowShortcuts=0x7f0100f5;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int allowStacking=0x7f0100af;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int alpha=0x7f0100b0;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>META</code></td><td>0x10000</td><td></td></tr>
    <tr><td><code>CTRL</code></td><td>0x1000</td><td></td></tr>
    <tr><td><code>ALT</code></td><td>0x02</td><td></td></tr>
    <tr><td><code>SHIFT</code></td><td>0x1</td><td></td></tr>
    <tr><td><code>SYM</code></td><td>0x4</td><td></td></tr>
    <tr><td><code>FUNCTION</code></td><td>0x8</td><td></td></tr>
    </table>
             */
            public static final int alphabeticModifiers=0x7f010104;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int arrowHeadLength=0x7f0100c7;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int arrowShaftLength=0x7f0100c8;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int autoCompleteTextViewStyle=0x7f01009d;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int autoSizeMaxTextSize=0x7f010037;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int autoSizeMinTextSize=0x7f010036;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int autoSizePresetSizes=0x7f010035;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int autoSizeStepGranularity=0x7f010034;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>uniform</code></td><td>1</td><td></td></tr>
    </table>
             */
            public static final int autoSizeTextType=0x7f010033;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int background=0x7f01000d;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int backgroundImage=0x7f0100e2;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int backgroundSplit=0x7f01000f;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int backgroundStacked=0x7f01000e;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int backgroundTint=0x7f01014d;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int backgroundTintMode=0x7f01014e;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int barLength=0x7f0100c9;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int borderlessButtonStyle=0x7f01006e;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonBarButtonStyle=0x7f01006b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonBarNegativeButtonStyle=0x7f01009b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonBarNeutralButtonStyle=0x7f01009c;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonBarPositiveButtonStyle=0x7f01009a;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonBarStyle=0x7f01006a;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    </table>
             */
            public static final int buttonGravity=0x7f010142;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int buttonIconDimen=0x7f01002b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonPanelSideLayout=0x7f010025;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>standard</code></td><td>0</td><td></td></tr>
    <tr><td><code>wide</code></td><td>1</td><td></td></tr>
    <tr><td><code>icon_only</code></td><td>2</td><td></td></tr>
    </table>
             */
            public static final int buttonSize=0x7f010129;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonStyle=0x7f01009e;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int buttonStyleSmall=0x7f01009f;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int buttonTint=0x7f0100b1;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int buttonTintMode=0x7f0100b2;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int checkboxStyle=0x7f0100a0;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int checkedTextViewStyle=0x7f0100a1;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int circleCrop=0x7f010103;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int closeIcon=0x7f010118;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int closeItemLayout=0x7f01001f;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int collapseContentDescription=0x7f010144;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int collapseIcon=0x7f010143;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int color=0x7f0100c3;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorAccent=0x7f01008d;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorBackgroundFloating=0x7f010094;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorButtonNormal=0x7f010091;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorControlActivated=0x7f01008f;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorControlHighlight=0x7f010090;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorControlNormal=0x7f01008e;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int colorError=0x7f0100ad;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorPrimary=0x7f01008b;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorPrimaryDark=0x7f01008c;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>dark</code></td><td>0</td><td></td></tr>
    <tr><td><code>light</code></td><td>1</td><td></td></tr>
    <tr><td><code>auto</code></td><td>2</td><td></td></tr>
    </table>
             */
            public static final int colorScheme=0x7f01012a;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int colorSwitchThumbNormal=0x7f010092;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int commitIcon=0x7f01011d;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentDescription=0x7f01010a;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentInsetEnd=0x7f010018;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentInsetEndWithActions=0x7f01001c;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentInsetLeft=0x7f010019;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentInsetRight=0x7f01001a;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentInsetStart=0x7f010017;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentInsetStartWithNavigation=0x7f01001b;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int contentProviderUri=0x7f0100bd;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int controlBackground=0x7f010093;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int coordinatorLayoutStyle=0x7f010000;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int corpusId=0x7f0100bb;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int corpusVersion=0x7f0100bc;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int customNavigationLayout=0x7f010010;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int defaultIntentAction=0x7f0100f2;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int defaultIntentActivity=0x7f0100f4;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int defaultIntentData=0x7f0100f3;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int defaultQueryHint=0x7f010117;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int dialogPreferredPadding=0x7f010063;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int dialogTheme=0x7f010062;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>useLogo</code></td><td>0x1</td><td></td></tr>
    <tr><td><code>showHome</code></td><td>0x2</td><td></td></tr>
    <tr><td><code>homeAsUp</code></td><td>0x4</td><td></td></tr>
    <tr><td><code>showTitle</code></td><td>0x8</td><td></td></tr>
    <tr><td><code>showCustom</code></td><td>0x10</td><td></td></tr>
    <tr><td><code>disableHome</code></td><td>0x20</td><td></td></tr>
    </table>
             */
            public static final int displayOptions=0x7f010006;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int divider=0x7f01000c;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int dividerHorizontal=0x7f010070;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int dividerPadding=0x7f010100;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int dividerVertical=0x7f01006f;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int documentMaxAgeSecs=0x7f0100c1;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int drawableSize=0x7f0100c5;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int drawerArrowStyle=0x7f010001;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int dropDownListViewStyle=0x7f010082;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int dropdownListPreferredItemHeight=0x7f010066;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int editTextBackground=0x7f010077;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int editTextColor=0x7f010076;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int editTextStyle=0x7f0100a2;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int elevation=0x7f01001d;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int expandActivityOverflowButtonDrawable=0x7f010021;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int fadeDuration=0x7f0100d6;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int failureImage=0x7f0100dc;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
             */
            public static final int failureImageScaleType=0x7f0100dd;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>match_global_nicknames</code></td><td>1</td><td></td></tr>
    <tr><td><code>demote_common_words</code></td><td>2</td><td></td></tr>
    <tr><td><code>demote_rfc822_hostnames</code></td><td>3</td><td></td></tr>
    <tr><td><code>omnibox_url_section</code></td><td>4</td><td></td></tr>
    <tr><td><code>omnibox_title_section</code></td><td>5</td><td></td></tr>
    <tr><td><code>index_entity_types</code></td><td>6</td><td></td></tr>
    </table>
             */
            public static final int featureType=0x7f010128;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int font=0x7f0100d4;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int fontFamily=0x7f010038;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int fontProviderAuthority=0x7f0100cd;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int fontProviderCerts=0x7f0100d0;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>blocking</code></td><td>0</td><td></td></tr>
    <tr><td><code>async</code></td><td>1</td><td></td></tr>
    </table>
             */
            public static final int fontProviderFetchStrategy=0x7f0100d1;
            /** <p>May be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>forever</code></td><td>-1</td><td></td></tr>
    </table>
             */
            public static final int fontProviderFetchTimeout=0x7f0100d2;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int fontProviderPackage=0x7f0100ce;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int fontProviderQuery=0x7f0100cf;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>normal</code></td><td>0</td><td></td></tr>
    <tr><td><code>italic</code></td><td>1</td><td></td></tr>
    </table>
             */
            public static final int fontStyle=0x7f0100d3;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int fontWeight=0x7f0100d5;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int gapBetweenBars=0x7f0100c6;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int goIcon=0x7f010119;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int height=0x7f010002;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int hideOnContentScroll=0x7f010016;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int homeAsUpIndicator=0x7f010068;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int homeLayout=0x7f010011;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int icon=0x7f01000a;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int iconTint=0x7f01010c;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int iconTintMode=0x7f01010d;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int iconifiedByDefault=0x7f010115;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int imageAspectRatio=0x7f010102;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>adjust_width</code></td><td>1</td><td></td></tr>
    <tr><td><code>adjust_height</code></td><td>2</td><td></td></tr>
    </table>
             */
            public static final int imageAspectRatioAdjust=0x7f010101;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int imageButtonStyle=0x7f010078;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int indeterminateProgressStyle=0x7f010013;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int indexPrefixes=0x7f010125;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int initialActivityCount=0x7f010020;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int inputEnabled=0x7f0100f8;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int isLightTheme=0x7f010003;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int itemPadding=0x7f010015;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int keylines=0x7f0100b3;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int layout=0x7f010114;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int layout_anchor=0x7f0100b6;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    <tr><td><code>left</code></td><td>0x03</td><td></td></tr>
    <tr><td><code>right</code></td><td>0x05</td><td></td></tr>
    <tr><td><code>center_vertical</code></td><td>0x10</td><td></td></tr>
    <tr><td><code>fill_vertical</code></td><td>0x70</td><td></td></tr>
    <tr><td><code>center_horizontal</code></td><td>0x01</td><td></td></tr>
    <tr><td><code>fill_horizontal</code></td><td>0x07</td><td></td></tr>
    <tr><td><code>center</code></td><td>0x11</td><td></td></tr>
    <tr><td><code>fill</code></td><td>0x77</td><td></td></tr>
    <tr><td><code>clip_vertical</code></td><td>0x80</td><td></td></tr>
    <tr><td><code>clip_horizontal</code></td><td>0x08</td><td></td></tr>
    <tr><td><code>start</code></td><td>0x00800003</td><td></td></tr>
    <tr><td><code>end</code></td><td>0x00800005</td><td></td></tr>
    </table>
             */
            public static final int layout_anchorGravity=0x7f0100b8;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int layout_behavior=0x7f0100b5;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0x0</td><td></td></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    <tr><td><code>left</code></td><td>0x03</td><td></td></tr>
    <tr><td><code>right</code></td><td>0x05</td><td></td></tr>
    <tr><td><code>start</code></td><td>0x00800003</td><td></td></tr>
    <tr><td><code>end</code></td><td>0x00800005</td><td></td></tr>
    <tr><td><code>all</code></td><td>0x77</td><td></td></tr>
    </table>
             */
            public static final int layout_dodgeInsetEdges=0x7f0100ba;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0x0</td><td></td></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    <tr><td><code>left</code></td><td>0x03</td><td></td></tr>
    <tr><td><code>right</code></td><td>0x05</td><td></td></tr>
    <tr><td><code>start</code></td><td>0x00800003</td><td></td></tr>
    <tr><td><code>end</code></td><td>0x00800005</td><td></td></tr>
    </table>
             */
            public static final int layout_insetEdge=0x7f0100b9;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int layout_keyline=0x7f0100b7;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int listChoiceBackgroundIndicator=0x7f01008a;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int listDividerAlertDialog=0x7f010064;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int listItemLayout=0x7f010029;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int listLayout=0x7f010026;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int listMenuViewStyle=0x7f0100aa;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int listPopupWindowStyle=0x7f010083;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int listPreferredItemHeight=0x7f01007d;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int listPreferredItemHeightLarge=0x7f01007f;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int listPreferredItemHeightSmall=0x7f01007e;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int listPreferredItemPaddingLeft=0x7f010080;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int listPreferredItemPaddingRight=0x7f010081;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int logo=0x7f01000b;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int logoDescription=0x7f010147;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int maxButtonHeight=0x7f010141;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int measureWithLargestChild=0x7f0100fe;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int multiChoiceItemLayout=0x7f010027;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int navigationContentDescription=0x7f010146;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int navigationIcon=0x7f010145;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>normal</code></td><td>0</td><td></td></tr>
    <tr><td><code>listMode</code></td><td>1</td><td></td></tr>
    <tr><td><code>tabMode</code></td><td>2</td><td></td></tr>
    </table>
             */
            public static final int navigationMode=0x7f010005;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int noIndex=0x7f010123;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>META</code></td><td>0x10000</td><td></td></tr>
    <tr><td><code>CTRL</code></td><td>0x1000</td><td></td></tr>
    <tr><td><code>ALT</code></td><td>0x02</td><td></td></tr>
    <tr><td><code>SHIFT</code></td><td>0x1</td><td></td></tr>
    <tr><td><code>SYM</code></td><td>0x4</td><td></td></tr>
    <tr><td><code>FUNCTION</code></td><td>0x8</td><td></td></tr>
    </table>
             */
            public static final int numericModifiers=0x7f010105;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int overlapAnchor=0x7f010110;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int overlayImage=0x7f0100e3;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int paddingBottomNoButtons=0x7f010112;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int paddingEnd=0x7f01014b;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int paddingStart=0x7f01014a;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int paddingTopNoTitle=0x7f010113;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int panelBackground=0x7f010087;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int panelMenuListTheme=0x7f010089;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int panelMenuListWidth=0x7f010088;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int paramName=0x7f0100cb;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int paramValue=0x7f0100cc;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int perAccountTemplate=0x7f0100c2;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int placeholderImage=0x7f0100d8;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
             */
            public static final int placeholderImageScaleType=0x7f0100d9;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int popupMenuStyle=0x7f010074;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int popupTheme=0x7f01001e;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int popupWindowStyle=0x7f010075;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int preserveIconSpacing=0x7f01010e;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int pressedStateOverlayImage=0x7f0100e4;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int progressBarAutoRotateInterval=0x7f0100e0;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int progressBarImage=0x7f0100de;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
             */
            public static final int progressBarImageScaleType=0x7f0100df;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int progressBarPadding=0x7f010014;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int progressBarStyle=0x7f010012;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int queryBackground=0x7f01011f;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int queryHint=0x7f010116;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int radioButtonStyle=0x7f0100a3;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int ratingBarStyle=0x7f0100a4;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int ratingBarStyleIndicator=0x7f0100a5;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int ratingBarStyleSmall=0x7f0100a6;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int retryImage=0x7f0100da;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
             */
            public static final int retryImageScaleType=0x7f0100db;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundAsCircle=0x7f0100e5;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundBottomLeft=0x7f0100ea;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundBottomRight=0x7f0100e9;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundTopLeft=0x7f0100e7;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundTopRight=0x7f0100e8;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundWithOverlayColor=0x7f0100eb;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundedCornerRadius=0x7f0100e6;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundingBorderColor=0x7f0100ed;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundingBorderPadding=0x7f0100ee;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int roundingBorderWidth=0x7f0100ec;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int schemaOrgProperty=0x7f010127;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int schemaOrgType=0x7f0100bf;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
             */
            public static final int scopeUris=0x7f01012b;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int searchEnabled=0x7f0100ef;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int searchHintIcon=0x7f01011b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int searchIcon=0x7f01011a;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int searchLabel=0x7f0100f0;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int searchViewStyle=0x7f01007c;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int sectionContent=0x7f0100f7;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>plain</code></td><td>0</td><td></td></tr>
    <tr><td><code>html</code></td><td>1</td><td></td></tr>
    <tr><td><code>rfc822</code></td><td>2</td><td></td></tr>
    <tr><td><code>url</code></td><td>3</td><td></td></tr>
    <tr><td><code>date</code></td><td>4</td><td></td></tr>
    </table>
             */
            public static final int sectionFormat=0x7f010122;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int sectionId=0x7f010121;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>text1</code></td><td>0</td><td></td></tr>
    <tr><td><code>text2</code></td><td>1</td><td></td></tr>
    <tr><td><code>icon_uri</code></td><td>2</td><td></td></tr>
    <tr><td><code>intent_action</code></td><td>3</td><td></td></tr>
    <tr><td><code>intent_data</code></td><td>4</td><td></td></tr>
    <tr><td><code>intent_data_id</code></td><td>5</td><td></td></tr>
    <tr><td><code>intent_extra_data</code></td><td>6</td><td></td></tr>
    <tr><td><code>large_icon_uri</code></td><td>7</td><td></td></tr>
    <tr><td><code>intent_activity</code></td><td>8</td><td></td></tr>
    <tr><td><code>thing_proto</code></td><td>9</td><td></td></tr>
    </table>
             */
            public static final int sectionType=0x7f0100f6;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int sectionWeight=0x7f010124;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int seekBarStyle=0x7f0100a7;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int selectableItemBackground=0x7f01006c;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int selectableItemBackgroundBorderless=0x7f01006d;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int semanticallySearchable=0x7f0100c0;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int settingsDescription=0x7f0100f1;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>never</code></td><td>0</td><td></td></tr>
    <tr><td><code>ifRoom</code></td><td>1</td><td></td></tr>
    <tr><td><code>always</code></td><td>2</td><td></td></tr>
    <tr><td><code>withText</code></td><td>4</td><td></td></tr>
    <tr><td><code>collapseActionView</code></td><td>8</td><td></td></tr>
    </table>
             */
            public static final int showAsAction=0x7f010106;
            /** <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>beginning</code></td><td>1</td><td></td></tr>
    <tr><td><code>middle</code></td><td>2</td><td></td></tr>
    <tr><td><code>end</code></td><td>4</td><td></td></tr>
    </table>
             */
            public static final int showDividers=0x7f0100ff;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int showText=0x7f010138;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int showTitle=0x7f01002a;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int singleChoiceItemLayout=0x7f010028;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>email</code></td><td>0</td><td></td></tr>
    <tr><td><code>contact</code></td><td>1</td><td></td></tr>
    <tr><td><code>instant_message</code></td><td>2</td><td></td></tr>
    </table>
             */
            public static final int sourceClass=0x7f0100f9;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int spinBars=0x7f0100c4;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int spinnerDropDownItemStyle=0x7f010067;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int spinnerStyle=0x7f0100a8;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int splitTrack=0x7f010137;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int srcCompat=0x7f01002c;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int state_above_anchor=0x7f010111;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int statusBarBackground=0x7f0100b4;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int subMenuArrow=0x7f01010f;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int submitBackground=0x7f010120;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int subsectionSeparator=0x7f010126;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int subtitle=0x7f010007;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int subtitleTextAppearance=0x7f01013a;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int subtitleTextColor=0x7f010149;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int subtitleTextStyle=0x7f010009;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int suggestionRowLayout=0x7f01011e;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int switchMinWidth=0x7f010135;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int switchPadding=0x7f010136;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int switchStyle=0x7f0100a9;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int switchTextAppearance=0x7f010134;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
             */
            public static final int textAllCaps=0x7f010032;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceLargePopupMenu=0x7f01005f;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceListItem=0x7f010084;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceListItemSecondary=0x7f010085;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceListItemSmall=0x7f010086;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearancePopupMenuHeader=0x7f010061;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceSearchResultSubtitle=0x7f01007a;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceSearchResultTitle=0x7f010079;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int textAppearanceSmallPopupMenu=0x7f010060;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int textColorAlertDialogListItem=0x7f010099;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int textColorSearchUrl=0x7f01007b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int theme=0x7f01014c;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int thickness=0x7f0100ca;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int thumbTextPadding=0x7f010133;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int thumbTint=0x7f01012e;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int thumbTintMode=0x7f01012f;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int tickMark=0x7f01002f;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int tickMarkTint=0x7f010030;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int tickMarkTintMode=0x7f010031;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int tint=0x7f01002d;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int tintMode=0x7f01002e;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int title=0x7f010004;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleMargin=0x7f01013b;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleMarginBottom=0x7f01013f;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleMarginEnd=0x7f01013d;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleMarginStart=0x7f01013c;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleMarginTop=0x7f01013e;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleMargins=0x7f010140;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int titleTextAppearance=0x7f010139;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int titleTextColor=0x7f010148;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int titleTextStyle=0x7f010008;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int toAddressesSection=0x7f0100fd;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int toolbarNavigationButtonStyle=0x7f010073;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int toolbarStyle=0x7f010072;
            /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
             */
            public static final int tooltipForegroundColor=0x7f0100ac;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int tooltipFrameBackground=0x7f0100ab;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int tooltipText=0x7f01010b;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int track=0x7f010130;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int trackTint=0x7f010131;
            /** <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
             */
            public static final int trackTintMode=0x7f010132;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int trimmable=0x7f0100be;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_artv_ratio_title=0x7f01014f;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_artv_ratio_x=0x7f010150;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_artv_ratio_y=0x7f010151;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_aspect_ratio_x=0x7f010152;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_aspect_ratio_y=0x7f010153;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_circle_dimmed_layer=0x7f010155;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_dimmed_color=0x7f010156;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_frame_color=0x7f01015d;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_frame_stroke_size=0x7f01015c;
            /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_grid_color=0x7f010158;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_grid_column_count=0x7f01015a;
            /** <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_grid_row_count=0x7f010159;
            /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_grid_stroke_size=0x7f010157;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_show_frame=0x7f01015e;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_show_grid=0x7f01015b;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int ucrop_show_oval_crop_frame=0x7f010154;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int userInputSection=0x7f0100fb;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int userInputTag=0x7f0100fa;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int userInputValue=0x7f0100fc;
            /** <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int viewAspectRatio=0x7f0100d7;
            /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int viewInflaterClass=0x7f0100ae;
            /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
             */
            public static final int voiceIcon=0x7f01011c;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowActionBar=0x7f010039;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowActionBarOverlay=0x7f01003b;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowActionModeOverlay=0x7f01003c;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowFixedHeightMajor=0x7f010040;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowFixedHeightMinor=0x7f01003e;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowFixedWidthMajor=0x7f01003d;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowFixedWidthMinor=0x7f01003f;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowMinWidthMajor=0x7f010041;
            /** <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowMinWidthMinor=0x7f010042;
            /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
             */
            public static final int windowNoTitle=0x7f01003a;
        }
        public static final class bool {
            public static final int abc_action_bar_embed_tabs=0x7f0a0000;
            public static final int abc_allow_stacked_button_bar=0x7f0a0001;
            public static final int abc_config_actionMenuItemAllCaps=0x7f0a0002;
            public static final int abc_config_showMenuShortcutsWhenKeyboardPresent=0x7f0a0003;
        }
        public static final class color {
            public static final int abc_background_cache_hint_selector_material_dark=0x7f0b0054;
            public static final int abc_background_cache_hint_selector_material_light=0x7f0b0055;
            public static final int abc_btn_colored_borderless_text_material=0x7f0b0056;
            public static final int abc_btn_colored_text_material=0x7f0b0057;
            public static final int abc_color_highlight_material=0x7f0b0058;
            public static final int abc_hint_foreground_material_dark=0x7f0b0059;
            public static final int abc_hint_foreground_material_light=0x7f0b005a;
            public static final int abc_input_method_navigation_guard=0x7f0b0001;
            public static final int abc_primary_text_disable_only_material_dark=0x7f0b005b;
            public static final int abc_primary_text_disable_only_material_light=0x7f0b005c;
            public static final int abc_primary_text_material_dark=0x7f0b005d;
            public static final int abc_primary_text_material_light=0x7f0b005e;
            public static final int abc_search_url_text=0x7f0b005f;
            public static final int abc_search_url_text_normal=0x7f0b0002;
            public static final int abc_search_url_text_pressed=0x7f0b0003;
            public static final int abc_search_url_text_selected=0x7f0b0004;
            public static final int abc_secondary_text_material_dark=0x7f0b0060;
            public static final int abc_secondary_text_material_light=0x7f0b0061;
            public static final int abc_tint_btn_checkable=0x7f0b0062;
            public static final int abc_tint_default=0x7f0b0063;
            public static final int abc_tint_edittext=0x7f0b0064;
            public static final int abc_tint_seek_thumb=0x7f0b0065;
            public static final int abc_tint_spinner=0x7f0b0066;
            public static final int abc_tint_switch_track=0x7f0b0067;
            public static final int accent_material_dark=0x7f0b0005;
            public static final int accent_material_light=0x7f0b0006;
            public static final int background_floating_material_dark=0x7f0b0007;
            public static final int background_floating_material_light=0x7f0b0008;
            public static final int background_material_dark=0x7f0b0009;
            public static final int background_material_light=0x7f0b000a;
            public static final int bright_foreground_disabled_material_dark=0x7f0b000b;
            public static final int bright_foreground_disabled_material_light=0x7f0b000c;
            public static final int bright_foreground_inverse_material_dark=0x7f0b000d;
            public static final int bright_foreground_inverse_material_light=0x7f0b000e;
            public static final int bright_foreground_material_dark=0x7f0b000f;
            public static final int bright_foreground_material_light=0x7f0b0010;
            public static final int button_material_dark=0x7f0b0011;
            public static final int button_material_light=0x7f0b0012;
            public static final int catalyst_redbox_background=0x7f0b0013;
            public static final int common_google_signin_btn_text_dark=0x7f0b0068;
            public static final int common_google_signin_btn_text_dark_default=0x7f0b0014;
            public static final int common_google_signin_btn_text_dark_disabled=0x7f0b0015;
            public static final int common_google_signin_btn_text_dark_focused=0x7f0b0016;
            public static final int common_google_signin_btn_text_dark_pressed=0x7f0b0017;
            public static final int common_google_signin_btn_text_light=0x7f0b0069;
            public static final int common_google_signin_btn_text_light_default=0x7f0b0018;
            public static final int common_google_signin_btn_text_light_disabled=0x7f0b0019;
            public static final int common_google_signin_btn_text_light_focused=0x7f0b001a;
            public static final int common_google_signin_btn_text_light_pressed=0x7f0b001b;
            public static final int common_google_signin_btn_tint=0x7f0b006a;
            public static final int dim_foreground_disabled_material_dark=0x7f0b001c;
            public static final int dim_foreground_disabled_material_light=0x7f0b001d;
            public static final int dim_foreground_material_dark=0x7f0b001e;
            public static final int dim_foreground_material_light=0x7f0b001f;
            public static final int error_color_material=0x7f0b0020;
            public static final int foreground_material_dark=0x7f0b0021;
            public static final int foreground_material_light=0x7f0b0022;
            public static final int highlighted_text_material_dark=0x7f0b0023;
            public static final int highlighted_text_material_light=0x7f0b0024;
            public static final int material_blue_grey_800=0x7f0b0025;
            public static final int material_blue_grey_900=0x7f0b0026;
            public static final int material_blue_grey_950=0x7f0b0027;
            public static final int material_deep_teal_200=0x7f0b0028;
            public static final int material_deep_teal_500=0x7f0b0029;
            public static final int material_grey_100=0x7f0b002a;
            public static final int material_grey_300=0x7f0b002b;
            public static final int material_grey_50=0x7f0b002c;
            public static final int material_grey_600=0x7f0b002d;
            public static final int material_grey_800=0x7f0b002e;
            public static final int material_grey_850=0x7f0b002f;
            public static final int material_grey_900=0x7f0b0030;
            public static final int notification_action_color_filter=0x7f0b0000;
            public static final int notification_icon_bg_color=0x7f0b0031;
            public static final int notification_material_background_media_default_color=0x7f0b0032;
            public static final int primary_dark_material_dark=0x7f0b0033;
            public static final int primary_dark_material_light=0x7f0b0034;
            public static final int primary_material_dark=0x7f0b0035;
            public static final int primary_material_light=0x7f0b0036;
            public static final int primary_text_default_material_dark=0x7f0b0037;
            public static final int primary_text_default_material_light=0x7f0b0038;
            public static final int primary_text_disabled_material_dark=0x7f0b0039;
            public static final int primary_text_disabled_material_light=0x7f0b003a;
            public static final int ripple_material_dark=0x7f0b003b;
            public static final int ripple_material_light=0x7f0b003c;
            public static final int secondary_text_default_material_dark=0x7f0b003d;
            public static final int secondary_text_default_material_light=0x7f0b003e;
            public static final int secondary_text_disabled_material_dark=0x7f0b003f;
            public static final int secondary_text_disabled_material_light=0x7f0b0040;
            public static final int switch_thumb_disabled_material_dark=0x7f0b0041;
            public static final int switch_thumb_disabled_material_light=0x7f0b0042;
            public static final int switch_thumb_material_dark=0x7f0b006b;
            public static final int switch_thumb_material_light=0x7f0b006c;
            public static final int switch_thumb_normal_material_dark=0x7f0b0043;
            public static final int switch_thumb_normal_material_light=0x7f0b0044;
            public static final int tooltip_background_dark=0x7f0b0045;
            public static final int tooltip_background_light=0x7f0b0046;
            public static final int ucrop_color_crop_background=0x7f0b0047;
            public static final int ucrop_color_default_crop_frame=0x7f0b0048;
            public static final int ucrop_color_default_crop_grid=0x7f0b0049;
            public static final int ucrop_color_default_dimmed=0x7f0b004a;
            public static final int ucrop_color_default_logo=0x7f0b004b;
            public static final int ucrop_color_progress_wheel_line=0x7f0b004c;
            public static final int ucrop_color_statusbar=0x7f0b004d;
            public static final int ucrop_color_toolbar=0x7f0b004e;
            public static final int ucrop_color_toolbar_widget=0x7f0b004f;
            public static final int ucrop_color_widget=0x7f0b0050;
            public static final int ucrop_color_widget_active=0x7f0b0051;
            public static final int ucrop_color_widget_background=0x7f0b0052;
            public static final int ucrop_color_widget_text=0x7f0b0053;
            public static final int ucrop_scale_text_view_selector=0x7f0b006d;
        }
        public static final class dimen {
            public static final int abc_action_bar_content_inset_material=0x7f08000c;
            public static final int abc_action_bar_content_inset_with_nav=0x7f08000d;
            public static final int abc_action_bar_default_height_material=0x7f080001;
            public static final int abc_action_bar_default_padding_end_material=0x7f08000e;
            public static final int abc_action_bar_default_padding_start_material=0x7f08000f;
            public static final int abc_action_bar_elevation_material=0x7f080015;
            public static final int abc_action_bar_icon_vertical_padding_material=0x7f080016;
            public static final int abc_action_bar_overflow_padding_end_material=0x7f080017;
            public static final int abc_action_bar_overflow_padding_start_material=0x7f080018;
            public static final int abc_action_bar_progress_bar_size=0x7f080002;
            public static final int abc_action_bar_stacked_max_height=0x7f080019;
            public static final int abc_action_bar_stacked_tab_max_width=0x7f08001a;
            public static final int abc_action_bar_subtitle_bottom_margin_material=0x7f08001b;
            public static final int abc_action_bar_subtitle_top_margin_material=0x7f08001c;
            public static final int abc_action_button_min_height_material=0x7f08001d;
            public static final int abc_action_button_min_width_material=0x7f08001e;
            public static final int abc_action_button_min_width_overflow_material=0x7f08001f;
            public static final int abc_alert_dialog_button_bar_height=0x7f080000;
            public static final int abc_alert_dialog_button_dimen=0x7f080020;
            public static final int abc_button_inset_horizontal_material=0x7f080021;
            public static final int abc_button_inset_vertical_material=0x7f080022;
            public static final int abc_button_padding_horizontal_material=0x7f080023;
            public static final int abc_button_padding_vertical_material=0x7f080024;
            public static final int abc_cascading_menus_min_smallest_width=0x7f080025;
            public static final int abc_config_prefDialogWidth=0x7f080005;
            public static final int abc_control_corner_material=0x7f080026;
            public static final int abc_control_inset_material=0x7f080027;
            public static final int abc_control_padding_material=0x7f080028;
            public static final int abc_dialog_fixed_height_major=0x7f080006;
            public static final int abc_dialog_fixed_height_minor=0x7f080007;
            public static final int abc_dialog_fixed_width_major=0x7f080008;
            public static final int abc_dialog_fixed_width_minor=0x7f080009;
            public static final int abc_dialog_list_padding_bottom_no_buttons=0x7f080029;
            public static final int abc_dialog_list_padding_top_no_title=0x7f08002a;
            public static final int abc_dialog_min_width_major=0x7f08000a;
            public static final int abc_dialog_min_width_minor=0x7f08000b;
            public static final int abc_dialog_padding_material=0x7f08002b;
            public static final int abc_dialog_padding_top_material=0x7f08002c;
            public static final int abc_dialog_title_divider_material=0x7f08002d;
            public static final int abc_disabled_alpha_material_dark=0x7f08002e;
            public static final int abc_disabled_alpha_material_light=0x7f08002f;
            public static final int abc_dropdownitem_icon_width=0x7f080030;
            public static final int abc_dropdownitem_text_padding_left=0x7f080031;
            public static final int abc_dropdownitem_text_padding_right=0x7f080032;
            public static final int abc_edit_text_inset_bottom_material=0x7f080033;
            public static final int abc_edit_text_inset_horizontal_material=0x7f080034;
            public static final int abc_edit_text_inset_top_material=0x7f080035;
            public static final int abc_floating_window_z=0x7f080036;
            public static final int abc_list_item_padding_horizontal_material=0x7f080037;
            public static final int abc_panel_menu_list_width=0x7f080038;
            public static final int abc_progress_bar_height_material=0x7f080039;
            public static final int abc_search_view_preferred_height=0x7f08003a;
            public static final int abc_search_view_preferred_width=0x7f08003b;
            public static final int abc_seekbar_track_background_height_material=0x7f08003c;
            public static final int abc_seekbar_track_progress_height_material=0x7f08003d;
            public static final int abc_select_dialog_padding_start_material=0x7f08003e;
            public static final int abc_switch_padding=0x7f080011;
            public static final int abc_text_size_body_1_material=0x7f08003f;
            public static final int abc_text_size_body_2_material=0x7f080040;
            public static final int abc_text_size_button_material=0x7f080041;
            public static final int abc_text_size_caption_material=0x7f080042;
            public static final int abc_text_size_display_1_material=0x7f080043;
            public static final int abc_text_size_display_2_material=0x7f080044;
            public static final int abc_text_size_display_3_material=0x7f080045;
            public static final int abc_text_size_display_4_material=0x7f080046;
            public static final int abc_text_size_headline_material=0x7f080047;
            public static final int abc_text_size_large_material=0x7f080048;
            public static final int abc_text_size_medium_material=0x7f080049;
            public static final int abc_text_size_menu_header_material=0x7f08004a;
            public static final int abc_text_size_menu_material=0x7f08004b;
            public static final int abc_text_size_small_material=0x7f08004c;
            public static final int abc_text_size_subhead_material=0x7f08004d;
            public static final int abc_text_size_subtitle_material_toolbar=0x7f080003;
            public static final int abc_text_size_title_material=0x7f08004e;
            public static final int abc_text_size_title_material_toolbar=0x7f080004;
            public static final int compat_button_inset_horizontal_material=0x7f08004f;
            public static final int compat_button_inset_vertical_material=0x7f080050;
            public static final int compat_button_padding_horizontal_material=0x7f080051;
            public static final int compat_button_padding_vertical_material=0x7f080052;
            public static final int compat_control_corner_material=0x7f080053;
            public static final int disabled_alpha_material_dark=0x7f080054;
            public static final int disabled_alpha_material_light=0x7f080055;
            public static final int highlight_alpha_material_colored=0x7f080056;
            public static final int highlight_alpha_material_dark=0x7f080057;
            public static final int highlight_alpha_material_light=0x7f080058;
            public static final int hint_alpha_material_dark=0x7f080059;
            public static final int hint_alpha_material_light=0x7f08005a;
            public static final int hint_pressed_alpha_material_dark=0x7f08005b;
            public static final int hint_pressed_alpha_material_light=0x7f08005c;
            public static final int notification_action_icon_size=0x7f08005d;
            public static final int notification_action_text_size=0x7f08005e;
            public static final int notification_big_circle_margin=0x7f08005f;
            public static final int notification_content_margin_start=0x7f080012;
            public static final int notification_large_icon_height=0x7f080060;
            public static final int notification_large_icon_width=0x7f080061;
            public static final int notification_main_column_padding_top=0x7f080013;
            public static final int notification_media_narrow_margin=0x7f080014;
            public static final int notification_right_icon_size=0x7f080062;
            public static final int notification_right_side_padding_top=0x7f080010;
            public static final int notification_small_icon_background_padding=0x7f080063;
            public static final int notification_small_icon_size_as_large=0x7f080064;
            public static final int notification_subtext_size=0x7f080065;
            public static final int notification_top_pad=0x7f080066;
            public static final int notification_top_pad_large_text=0x7f080067;
            public static final int tooltip_corner_radius=0x7f080068;
            public static final int tooltip_horizontal_padding=0x7f080069;
            public static final int tooltip_margin=0x7f08006a;
            public static final int tooltip_precise_anchor_extra_offset=0x7f08006b;
            public static final int tooltip_precise_anchor_threshold=0x7f08006c;
            public static final int tooltip_vertical_padding=0x7f08006d;
            public static final int tooltip_y_offset_non_touch=0x7f08006e;
            public static final int tooltip_y_offset_touch=0x7f08006f;
            public static final int ucrop_default_crop_frame_stoke_width=0x7f080070;
            public static final int ucrop_default_crop_grid_stoke_width=0x7f080071;
            public static final int ucrop_default_crop_logo_size=0x7f080072;
            public static final int ucrop_default_crop_rect_corner_touch_area_line_length=0x7f080073;
            public static final int ucrop_default_crop_rect_corner_touch_threshold=0x7f080074;
            public static final int ucrop_default_crop_rect_min_size=0x7f080075;
            public static final int ucrop_height_crop_aspect_ratio_text=0x7f080076;
            public static final int ucrop_height_divider_shadow=0x7f080077;
            public static final int ucrop_height_horizontal_wheel_progress_line=0x7f080078;
            public static final int ucrop_height_wrapper_controls=0x7f080079;
            public static final int ucrop_height_wrapper_states=0x7f08007a;
            public static final int ucrop_margin_horizontal_wheel_progress_line=0x7f08007b;
            public static final int ucrop_margit_top_widget_text=0x7f08007c;
            public static final int ucrop_padding_crop_frame=0x7f08007d;
            public static final int ucrop_progress_size=0x7f08007e;
            public static final int ucrop_size_dot_scale_text_view=0x7f08007f;
            public static final int ucrop_size_wrapper_rotate_button=0x7f080080;
            public static final int ucrop_text_size_widget_text=0x7f080081;
            public static final int ucrop_width_horizontal_wheel_progress_line=0x7f080082;
        }
        public static final class drawable {
            public static final int abc_ab_share_pack_mtrl_alpha=0x7f020000;
            public static final int abc_action_bar_item_background_material=0x7f020001;
            public static final int abc_btn_borderless_material=0x7f020002;
            public static final int abc_btn_check_material=0x7f020003;
            public static final int abc_btn_check_to_on_mtrl_000=0x7f020004;
            public static final int abc_btn_check_to_on_mtrl_015=0x7f020005;
            public static final int abc_btn_colored_material=0x7f020006;
            public static final int abc_btn_default_mtrl_shape=0x7f020007;
            public static final int abc_btn_radio_material=0x7f020008;
            public static final int abc_btn_radio_to_on_mtrl_000=0x7f020009;
            public static final int abc_btn_radio_to_on_mtrl_015=0x7f02000a;
            public static final int abc_btn_switch_to_on_mtrl_00001=0x7f02000b;
            public static final int abc_btn_switch_to_on_mtrl_00012=0x7f02000c;
            public static final int abc_cab_background_internal_bg=0x7f02000d;
            public static final int abc_cab_background_top_material=0x7f02000e;
            public static final int abc_cab_background_top_mtrl_alpha=0x7f02000f;
            public static final int abc_control_background_material=0x7f020010;
            public static final int abc_dialog_material_background=0x7f020011;
            public static final int abc_edit_text_material=0x7f020012;
            public static final int abc_ic_ab_back_material=0x7f020013;
            public static final int abc_ic_arrow_drop_right_black_24dp=0x7f020014;
            public static final int abc_ic_clear_material=0x7f020015;
            public static final int abc_ic_commit_search_api_mtrl_alpha=0x7f020016;
            public static final int abc_ic_go_search_api_material=0x7f020017;
            public static final int abc_ic_menu_copy_mtrl_am_alpha=0x7f020018;
            public static final int abc_ic_menu_cut_mtrl_alpha=0x7f020019;
            public static final int abc_ic_menu_overflow_material=0x7f02001a;
            public static final int abc_ic_menu_paste_mtrl_am_alpha=0x7f02001b;
            public static final int abc_ic_menu_selectall_mtrl_alpha=0x7f02001c;
            public static final int abc_ic_menu_share_mtrl_alpha=0x7f02001d;
            public static final int abc_ic_search_api_material=0x7f02001e;
            public static final int abc_ic_star_black_16dp=0x7f02001f;
            public static final int abc_ic_star_black_36dp=0x7f020020;
            public static final int abc_ic_star_black_48dp=0x7f020021;
            public static final int abc_ic_star_half_black_16dp=0x7f020022;
            public static final int abc_ic_star_half_black_36dp=0x7f020023;
            public static final int abc_ic_star_half_black_48dp=0x7f020024;
            public static final int abc_ic_voice_search_api_material=0x7f020025;
            public static final int abc_item_background_holo_dark=0x7f020026;
            public static final int abc_item_background_holo_light=0x7f020027;
            public static final int abc_list_divider_mtrl_alpha=0x7f020028;
            public static final int abc_list_focused_holo=0x7f020029;
            public static final int abc_list_longpressed_holo=0x7f02002a;
            public static final int abc_list_pressed_holo_dark=0x7f02002b;
            public static final int abc_list_pressed_holo_light=0x7f02002c;
            public static final int abc_list_selector_background_transition_holo_dark=0x7f02002d;
            public static final int abc_list_selector_background_transition_holo_light=0x7f02002e;
            public static final int abc_list_selector_disabled_holo_dark=0x7f02002f;
            public static final int abc_list_selector_disabled_holo_light=0x7f020030;
            public static final int abc_list_selector_holo_dark=0x7f020031;
            public static final int abc_list_selector_holo_light=0x7f020032;
            public static final int abc_menu_hardkey_panel_mtrl_mult=0x7f020033;
            public static final int abc_popup_background_mtrl_mult=0x7f020034;
            public static final int abc_ratingbar_indicator_material=0x7f020035;
            public static final int abc_ratingbar_material=0x7f020036;
            public static final int abc_ratingbar_small_material=0x7f020037;
            public static final int abc_scrubber_control_off_mtrl_alpha=0x7f020038;
            public static final int abc_scrubber_control_to_pressed_mtrl_000=0x7f020039;
            public static final int abc_scrubber_control_to_pressed_mtrl_005=0x7f02003a;
            public static final int abc_scrubber_primary_mtrl_alpha=0x7f02003b;
            public static final int abc_scrubber_track_mtrl_alpha=0x7f02003c;
            public static final int abc_seekbar_thumb_material=0x7f02003d;
            public static final int abc_seekbar_tick_mark_material=0x7f02003e;
            public static final int abc_seekbar_track_material=0x7f02003f;
            public static final int abc_spinner_mtrl_am_alpha=0x7f020040;
            public static final int abc_spinner_textfield_background_material=0x7f020041;
            public static final int abc_switch_thumb_material=0x7f020042;
            public static final int abc_switch_track_mtrl_alpha=0x7f020043;
            public static final int abc_tab_indicator_material=0x7f020044;
            public static final int abc_tab_indicator_mtrl_alpha=0x7f020045;
            public static final int abc_text_cursor_material=0x7f020046;
            public static final int abc_text_select_handle_left_mtrl_dark=0x7f020047;
            public static final int abc_text_select_handle_left_mtrl_light=0x7f020048;
            public static final int abc_text_select_handle_middle_mtrl_dark=0x7f020049;
            public static final int abc_text_select_handle_middle_mtrl_light=0x7f02004a;
            public static final int abc_text_select_handle_right_mtrl_dark=0x7f02004b;
            public static final int abc_text_select_handle_right_mtrl_light=0x7f02004c;
            public static final int abc_textfield_activated_mtrl_alpha=0x7f02004d;
            public static final int abc_textfield_default_mtrl_alpha=0x7f02004e;
            public static final int abc_textfield_search_activated_mtrl_alpha=0x7f02004f;
            public static final int abc_textfield_search_default_mtrl_alpha=0x7f020050;
            public static final int abc_textfield_search_material=0x7f020051;
            public static final int abc_vector_test=0x7f020052;
            public static final int common_full_open_on_phone=0x7f020053;
            public static final int common_google_signin_btn_icon_dark=0x7f020054;
            public static final int common_google_signin_btn_icon_dark_focused=0x7f020055;
            public static final int common_google_signin_btn_icon_dark_normal=0x7f020056;
            public static final int common_google_signin_btn_icon_dark_normal_background=0x7f020057;
            public static final int common_google_signin_btn_icon_disabled=0x7f020058;
            public static final int common_google_signin_btn_icon_light=0x7f020059;
            public static final int common_google_signin_btn_icon_light_focused=0x7f02005a;
            public static final int common_google_signin_btn_icon_light_normal=0x7f02005b;
            public static final int common_google_signin_btn_icon_light_normal_background=0x7f02005c;
            public static final int common_google_signin_btn_text_dark=0x7f02005d;
            public static final int common_google_signin_btn_text_dark_focused=0x7f02005e;
            public static final int common_google_signin_btn_text_dark_normal=0x7f02005f;
            public static final int common_google_signin_btn_text_dark_normal_background=0x7f020060;
            public static final int common_google_signin_btn_text_disabled=0x7f020061;
            public static final int common_google_signin_btn_text_light=0x7f020062;
            public static final int common_google_signin_btn_text_light_focused=0x7f020063;
            public static final int common_google_signin_btn_text_light_normal=0x7f020064;
            public static final int common_google_signin_btn_text_light_normal_background=0x7f020065;
            public static final int googleg_disabled_color_18=0x7f020066;
            public static final int googleg_standard_color_18=0x7f020067;
            public static final int node_modules_reactnavigation_src_views_assets_backicon=0x7f020068;
            public static final int node_modules_reactnavigation_src_views_assets_backiconmask=0x7f020069;
            public static final int notification_action_background=0x7f02006a;
            public static final int notification_bg=0x7f02006b;
            public static final int notification_bg_low=0x7f02006c;
            public static final int notification_bg_low_normal=0x7f02006d;
            public static final int notification_bg_low_pressed=0x7f02006e;
            public static final int notification_bg_normal=0x7f02006f;
            public static final int notification_bg_normal_pressed=0x7f020070;
            public static final int notification_icon_background=0x7f020071;
            public static final int notification_template_icon_bg=0x7f020085;
            public static final int notification_template_icon_low_bg=0x7f020086;
            public static final int notification_tile_bg=0x7f020072;
            public static final int notify_panel_notification_icon_bg=0x7f020073;
            public static final int src_views_images_bg=0x7f020074;
            public static final int src_views_images_defaultavatar=0x7f020075;
            public static final int src_views_images_logo=0x7f020076;
            public static final int tooltip_frame_dark=0x7f020077;
            public static final int tooltip_frame_light=0x7f020078;
            public static final int ucrop_ic_angle=0x7f020079;
            public static final int ucrop_ic_crop=0x7f02007a;
            public static final int ucrop_ic_cross=0x7f02007b;
            public static final int ucrop_ic_done=0x7f02007c;
            public static final int ucrop_ic_next=0x7f02007d;
            public static final int ucrop_ic_reset=0x7f02007e;
            public static final int ucrop_ic_rotate=0x7f02007f;
            public static final int ucrop_ic_scale=0x7f020080;
            public static final int ucrop_shadow_upside=0x7f020081;
            public static final int ucrop_vector_ic_crop=0x7f020082;
            public static final int ucrop_vector_loader=0x7f020083;
            public static final int ucrop_vector_loader_animated=0x7f020084;
        }
        public static final class id {
            public static final int ALT=0x7f0c004e;
            public static final int CTRL=0x7f0c004f;
            public static final int FUNCTION=0x7f0c0050;
            public static final int META=0x7f0c0051;
            public static final int SHIFT=0x7f0c0052;
            public static final int SYM=0x7f0c0053;
            public static final int action0=0x7f0c00a0;
            public static final int action_bar=0x7f0c008c;
            public static final int action_bar_activity_content=0x7f0c0000;
            public static final int action_bar_container=0x7f0c008b;
            public static final int action_bar_root=0x7f0c0087;
            public static final int action_bar_spinner=0x7f0c0001;
            public static final int action_bar_subtitle=0x7f0c006b;
            public static final int action_bar_title=0x7f0c006a;
            public static final int action_container=0x7f0c009d;
            public static final int action_context_bar=0x7f0c008d;
            public static final int action_divider=0x7f0c00a4;
            public static final int action_image=0x7f0c009e;
            public static final int action_menu_divider=0x7f0c0002;
            public static final int action_menu_presenter=0x7f0c0003;
            public static final int action_mode_bar=0x7f0c0089;
            public static final int action_mode_bar_stub=0x7f0c0088;
            public static final int action_mode_close_button=0x7f0c006c;
            public static final int action_text=0x7f0c009f;
            public static final int actions=0x7f0c00ad;
            public static final int activity_chooser_view_content=0x7f0c006d;
            public static final int add=0x7f0c001c;
            public static final int adjust_height=0x7f0c004c;
            public static final int adjust_width=0x7f0c004d;
            public static final int alertTitle=0x7f0c0080;
            public static final int all=0x7f0c0032;
            public static final int always=0x7f0c0054;
            public static final int async=0x7f0c0033;
            public static final int auto=0x7f0c0067;
            public static final int beginning=0x7f0c004a;
            public static final int blocking=0x7f0c0034;
            public static final int bottom=0x7f0c0024;
            public static final int buttonPanel=0x7f0c0073;
            public static final int cancel_action=0x7f0c00a1;
            public static final int catalyst_redbox_title=0x7f0c00b2;
            public static final int center=0x7f0c0025;
            public static final int centerCrop=0x7f0c0037;
            public static final int centerInside=0x7f0c0038;
            public static final int center_horizontal=0x7f0c0026;
            public static final int center_vertical=0x7f0c0027;
            public static final int checkbox=0x7f0c0083;
            public static final int chronometer=0x7f0c00a9;
            public static final int clip_horizontal=0x7f0c0028;
            public static final int clip_vertical=0x7f0c0029;
            public static final int collapseActionView=0x7f0c0055;
            public static final int contact=0x7f0c0047;
            public static final int contentPanel=0x7f0c0076;
            public static final int crash_reporting_present=0x7f0c0004;
            public static final int custom=0x7f0c007d;
            public static final int customPanel=0x7f0c007c;
            public static final int dark=0x7f0c0068;
            public static final int date=0x7f0c0059;
            public static final int decor_content_parent=0x7f0c008a;
            public static final int default_activity_button=0x7f0c0070;
            public static final int demote_common_words=0x7f0c005e;
            public static final int demote_rfc822_hostnames=0x7f0c005f;
            public static final int disableHome=0x7f0c0015;
            public static final int edit_query=0x7f0c008e;
            public static final int email=0x7f0c0048;
            public static final int end=0x7f0c002a;
            public static final int end_padder=0x7f0c00af;
            public static final int expand_activities_button=0x7f0c006e;
            public static final int expanded_menu=0x7f0c0082;
            public static final int fill=0x7f0c002b;
            public static final int fill_horizontal=0x7f0c002c;
            public static final int fill_vertical=0x7f0c002d;
            public static final int fitCenter=0x7f0c0039;
            public static final int fitEnd=0x7f0c003a;
            public static final int fitStart=0x7f0c003b;
            public static final int fitXY=0x7f0c003c;
            public static final int focusCrop=0x7f0c003d;
            public static final int forever=0x7f0c0035;
            public static final int fps_text=0x7f0c009c;
            public static final int home=0x7f0c0005;
            public static final int homeAsUp=0x7f0c0016;
            public static final int html=0x7f0c005a;
            public static final int icon=0x7f0c0072;
            public static final int icon_group=0x7f0c00ae;
            public static final int icon_only=0x7f0c0064;
            public static final int icon_uri=0x7f0c003e;
            public static final int ifRoom=0x7f0c0056;
            public static final int image=0x7f0c006f;
            public static final int image_view_crop=0x7f0c00d2;
            public static final int image_view_logo=0x7f0c00c0;
            public static final int image_view_state_aspect_ratio=0x7f0c00c9;
            public static final int image_view_state_rotate=0x7f0c00cb;
            public static final int image_view_state_scale=0x7f0c00c7;
            public static final int index_entity_types=0x7f0c0060;
            public static final int info=0x7f0c00aa;
            public static final int instant_message=0x7f0c0049;
            public static final int intent_action=0x7f0c003f;
            public static final int intent_activity=0x7f0c0040;
            public static final int intent_data=0x7f0c0041;
            public static final int intent_data_id=0x7f0c0042;
            public static final int intent_extra_data=0x7f0c0043;
            public static final int italic=0x7f0c0036;
            public static final int large_icon_uri=0x7f0c0044;
            public static final int layout_aspect_ratio=0x7f0c00c3;
            public static final int layout_rotate_wheel=0x7f0c00c4;
            public static final int layout_scale_wheel=0x7f0c00c5;
            public static final int left=0x7f0c002e;
            public static final int light=0x7f0c0069;
            public static final int line1=0x7f0c0006;
            public static final int line3=0x7f0c0007;
            public static final int listMode=0x7f0c0012;
            public static final int list_item=0x7f0c0071;
            public static final int match_global_nicknames=0x7f0c0061;
            public static final int media_actions=0x7f0c00a3;
            public static final int menu_crop=0x7f0c00d4;
            public static final int menu_loader=0x7f0c00d5;
            public static final int message=0x7f0c009b;
            public static final int middle=0x7f0c004b;
            public static final int multiply=0x7f0c001d;
            public static final int never=0x7f0c0057;
            public static final int none=0x7f0c0017;
            public static final int normal=0x7f0c0013;
            public static final int notification_background=0x7f0c00ab;
            public static final int notification_main_column=0x7f0c00a6;
            public static final int notification_main_column_container=0x7f0c00a5;
            public static final int omnibox_title_section=0x7f0c0062;
            public static final int omnibox_url_section=0x7f0c0063;
            public static final int parentPanel=0x7f0c0075;
            public static final int plain=0x7f0c005b;
            public static final int progress_circular=0x7f0c0008;
            public static final int progress_horizontal=0x7f0c0009;
            public static final int radio=0x7f0c0085;
            public static final int react_test_id=0x7f0c000a;
            public static final int rfc822=0x7f0c005c;
            public static final int right=0x7f0c002f;
            public static final int right_icon=0x7f0c00ac;
            public static final int right_side=0x7f0c00a7;
            public static final int rn_frame_file=0x7f0c00b1;
            public static final int rn_frame_method=0x7f0c00b0;
            public static final int rn_redbox_copy_button=0x7f0c00b9;
            public static final int rn_redbox_dismiss_button=0x7f0c00b7;
            public static final int rn_redbox_line_separator=0x7f0c00b4;
            public static final int rn_redbox_loading_indicator=0x7f0c00b5;
            public static final int rn_redbox_reload_button=0x7f0c00b8;
            public static final int rn_redbox_report_button=0x7f0c00ba;
            public static final int rn_redbox_report_label=0x7f0c00b6;
            public static final int rn_redbox_stack=0x7f0c00b3;
            public static final int rotate_scroll_wheel=0x7f0c00cd;
            public static final int scale_scroll_wheel=0x7f0c00d1;
            public static final int screen=0x7f0c001e;
            public static final int scrollIndicatorDown=0x7f0c007b;
            public static final int scrollIndicatorUp=0x7f0c0077;
            public static final int scrollView=0x7f0c0078;
            public static final int search_badge=0x7f0c0090;
            public static final int search_bar=0x7f0c008f;
            public static final int search_button=0x7f0c0091;
            public static final int search_close_btn=0x7f0c0096;
            public static final int search_edit_frame=0x7f0c0092;
            public static final int search_go_btn=0x7f0c0098;
            public static final int search_mag_icon=0x7f0c0093;
            public static final int search_plate=0x7f0c0094;
            public static final int search_src_text=0x7f0c0095;
            public static final int search_voice_btn=0x7f0c0099;
            public static final int select_dialog_listview=0x7f0c009a;
            public static final int shortcut=0x7f0c0084;
            public static final int showCustom=0x7f0c0018;
            public static final int showHome=0x7f0c0019;
            public static final int showTitle=0x7f0c001a;
            public static final int spacer=0x7f0c0074;
            public static final int split_action_bar=0x7f0c000b;
            public static final int src_atop=0x7f0c001f;
            public static final int src_in=0x7f0c0020;
            public static final int src_over=0x7f0c0021;
            public static final int standard=0x7f0c0065;
            public static final int start=0x7f0c0030;
            public static final int state_aspect_ratio=0x7f0c00c8;
            public static final int state_rotate=0x7f0c00ca;
            public static final int state_scale=0x7f0c00c6;
            public static final int status_bar_latest_event_content=0x7f0c00a2;
            public static final int submenuarrow=0x7f0c0086;
            public static final int submit_area=0x7f0c0097;
            public static final int tabMode=0x7f0c0014;
            public static final int tag_transition_group=0x7f0c000c;
            public static final int text=0x7f0c000d;
            public static final int text1=0x7f0c0045;
            public static final int text2=0x7f0c000e;
            public static final int textSpacerNoButtons=0x7f0c007a;
            public static final int textSpacerNoTitle=0x7f0c0079;
            public static final int text_view_rotate=0x7f0c00cc;
            public static final int text_view_scale=0x7f0c00d0;
            public static final int thing_proto=0x7f0c0046;
            public static final int time=0x7f0c00a8;
            public static final int title=0x7f0c000f;
            public static final int titleDividerNoCustom=0x7f0c0081;
            public static final int title_template=0x7f0c007f;
            public static final int toolbar=0x7f0c00bc;
            public static final int toolbar_title=0x7f0c00bd;
            public static final int top=0x7f0c0031;
            public static final int topPanel=0x7f0c007e;
            public static final int ucrop=0x7f0c00c1;
            public static final int ucrop_frame=0x7f0c00be;
            public static final int ucrop_photobox=0x7f0c00bb;
            public static final int uniform=0x7f0c0022;
            public static final int up=0x7f0c0010;
            public static final int url=0x7f0c005d;
            public static final int useLogo=0x7f0c001b;
            public static final int view_overlay=0x7f0c00d3;
            public static final int view_tag_native_id=0x7f0c0011;
            public static final int wide=0x7f0c0066;
            public static final int withText=0x7f0c0058;
            public static final int wrap_content=0x7f0c0023;
            public static final int wrapper_controls=0x7f0c00bf;
            public static final int wrapper_reset_rotate=0x7f0c00ce;
            public static final int wrapper_rotate_by_angle=0x7f0c00cf;
            public static final int wrapper_states=0x7f0c00c2;
        }
        public static final class integer {
            public static final int abc_config_activityDefaultDur=0x7f0d0000;
            public static final int abc_config_activityShortDur=0x7f0d0001;
            public static final int cancel_button_image_alpha=0x7f0d0002;
            public static final int config_tooltipAnimTime=0x7f0d0003;
            public static final int google_play_services_version=0x7f0d0004;
            public static final int status_bar_notification_info_maxnum=0x7f0d0005;
            public static final int ucrop_progress_loading_anim_time=0x7f0d0006;
        }
        public static final class layout {
            public static final int abc_action_bar_title_item=0x7f040000;
            public static final int abc_action_bar_up_container=0x7f040001;
            public static final int abc_action_menu_item_layout=0x7f040002;
            public static final int abc_action_menu_layout=0x7f040003;
            public static final int abc_action_mode_bar=0x7f040004;
            public static final int abc_action_mode_close_item_material=0x7f040005;
            public static final int abc_activity_chooser_view=0x7f040006;
            public static final int abc_activity_chooser_view_list_item=0x7f040007;
            public static final int abc_alert_dialog_button_bar_material=0x7f040008;
            public static final int abc_alert_dialog_material=0x7f040009;
            public static final int abc_alert_dialog_title_material=0x7f04000a;
            public static final int abc_dialog_title_material=0x7f04000b;
            public static final int abc_expanded_menu_layout=0x7f04000c;
            public static final int abc_list_menu_item_checkbox=0x7f04000d;
            public static final int abc_list_menu_item_icon=0x7f04000e;
            public static final int abc_list_menu_item_layout=0x7f04000f;
            public static final int abc_list_menu_item_radio=0x7f040010;
            public static final int abc_popup_menu_header_item_layout=0x7f040011;
            public static final int abc_popup_menu_item_layout=0x7f040012;
            public static final int abc_screen_content_include=0x7f040013;
            public static final int abc_screen_simple=0x7f040014;
            public static final int abc_screen_simple_overlay_action_mode=0x7f040015;
            public static final int abc_screen_toolbar=0x7f040016;
            public static final int abc_search_dropdown_item_icons_2line=0x7f040017;
            public static final int abc_search_view=0x7f040018;
            public static final int abc_select_dialog_material=0x7f040019;
            public static final int abc_tooltip=0x7f04001a;
            public static final int dev_loading_view=0x7f04001b;
            public static final int fps_view=0x7f04001c;
            public static final int notification_action=0x7f04001d;
            public static final int notification_action_tombstone=0x7f04001e;
            public static final int notification_media_action=0x7f04001f;
            public static final int notification_media_cancel_action=0x7f040020;
            public static final int notification_template_big_media=0x7f040021;
            public static final int notification_template_big_media_custom=0x7f040022;
            public static final int notification_template_big_media_narrow=0x7f040023;
            public static final int notification_template_big_media_narrow_custom=0x7f040024;
            public static final int notification_template_custom_big=0x7f040025;
            public static final int notification_template_icon_group=0x7f040026;
            public static final int notification_template_lines_media=0x7f040027;
            public static final int notification_template_media=0x7f040028;
            public static final int notification_template_media_custom=0x7f040029;
            public static final int notification_template_part_chronometer=0x7f04002a;
            public static final int notification_template_part_time=0x7f04002b;
            public static final int redbox_item_frame=0x7f04002c;
            public static final int redbox_item_title=0x7f04002d;
            public static final int redbox_view=0x7f04002e;
            public static final int select_dialog_item_material=0x7f04002f;
            public static final int select_dialog_multichoice_material=0x7f040030;
            public static final int select_dialog_singlechoice_material=0x7f040031;
            public static final int support_simple_spinner_dropdown_item=0x7f040032;
            public static final int ucrop_activity_photobox=0x7f040033;
            public static final int ucrop_aspect_ratio=0x7f040034;
            public static final int ucrop_controls=0x7f040035;
            public static final int ucrop_fragment_photobox=0x7f040036;
            public static final int ucrop_layout_rotate_wheel=0x7f040037;
            public static final int ucrop_layout_scale_wheel=0x7f040038;
            public static final int ucrop_view=0x7f040039;
        }
        public static final class menu {
            public static final int ucrop_menu_activity=0x7f0e0000;
        }
        public static final class mipmap {
            public static final int ic_launcher=0x7f030000;
        }
        public static final class string {
            public static final int abc_action_bar_home_description=0x7f070000;
            public static final int abc_action_bar_up_description=0x7f070001;
            public static final int abc_action_menu_overflow_description=0x7f070002;
            public static final int abc_action_mode_done=0x7f070003;
            public static final int abc_activity_chooser_view_see_all=0x7f070004;
            public static final int abc_activitychooserview_choose_application=0x7f070005;
            public static final int abc_capital_off=0x7f070006;
            public static final int abc_capital_on=0x7f070007;
            public static final int abc_font_family_body_1_material=0x7f070032;
            public static final int abc_font_family_body_2_material=0x7f070033;
            public static final int abc_font_family_button_material=0x7f070034;
            public static final int abc_font_family_caption_material=0x7f070035;
            public static final int abc_font_family_display_1_material=0x7f070036;
            public static final int abc_font_family_display_2_material=0x7f070037;
            public static final int abc_font_family_display_3_material=0x7f070038;
            public static final int abc_font_family_display_4_material=0x7f070039;
            public static final int abc_font_family_headline_material=0x7f07003a;
            public static final int abc_font_family_menu_material=0x7f07003b;
            public static final int abc_font_family_subhead_material=0x7f07003c;
            public static final int abc_font_family_title_material=0x7f07003d;
            public static final int abc_search_hint=0x7f070008;
            public static final int abc_searchview_description_clear=0x7f070009;
            public static final int abc_searchview_description_query=0x7f07000a;
            public static final int abc_searchview_description_search=0x7f07000b;
            public static final int abc_searchview_description_submit=0x7f07000c;
            public static final int abc_searchview_description_voice=0x7f07000d;
            public static final int abc_shareactionprovider_share_with=0x7f07000e;
            public static final int abc_shareactionprovider_share_with_application=0x7f07000f;
            public static final int abc_toolbar_collapse_description=0x7f070010;
            public static final int app_name=0x7f07003e;
            public static final int catalyst_copy_button=0x7f07003f;
            public static final int catalyst_debugjs=0x7f070040;
            public static final int catalyst_debugjs_nuclide=0x7f070041;
            public static final int catalyst_debugjs_nuclide_failure=0x7f070042;
            public static final int catalyst_debugjs_off=0x7f070043;
            public static final int catalyst_dismiss_button=0x7f070044;
            public static final int catalyst_element_inspector=0x7f070045;
            public static final int catalyst_heap_capture=0x7f070046;
            public static final int catalyst_hot_module_replacement=0x7f070047;
            public static final int catalyst_hot_module_replacement_off=0x7f070048;
            public static final int catalyst_jsload_error=0x7f070049;
            public static final int catalyst_live_reload=0x7f07004a;
            public static final int catalyst_live_reload_off=0x7f07004b;
            public static final int catalyst_loading_from_url=0x7f07004c;
            public static final int catalyst_perf_monitor=0x7f07004d;
            public static final int catalyst_perf_monitor_off=0x7f07004e;
            public static final int catalyst_poke_sampling_profiler=0x7f07004f;
            public static final int catalyst_reload_button=0x7f070050;
            public static final int catalyst_reloadjs=0x7f070051;
            public static final int catalyst_remotedbg_error=0x7f070052;
            public static final int catalyst_remotedbg_message=0x7f070053;
            public static final int catalyst_report_button=0x7f070054;
            public static final int catalyst_settings=0x7f070055;
            public static final int catalyst_settings_title=0x7f070056;
            public static final int common_google_play_services_enable_button=0x7f070011;
            public static final int common_google_play_services_enable_text=0x7f070012;
            public static final int common_google_play_services_enable_title=0x7f070013;
            public static final int common_google_play_services_install_button=0x7f070014;
            public static final int common_google_play_services_install_text=0x7f070015;
            public static final int common_google_play_services_install_title=0x7f070016;
            public static final int common_google_play_services_notification_channel_name=0x7f070017;
            public static final int common_google_play_services_notification_ticker=0x7f070018;
            public static final int common_google_play_services_unknown_issue=0x7f070019;
            public static final int common_google_play_services_unsupported_text=0x7f07001a;
            public static final int common_google_play_services_update_button=0x7f07001b;
            public static final int common_google_play_services_update_text=0x7f07001c;
            public static final int common_google_play_services_update_title=0x7f07001d;
            public static final int common_google_play_services_updating_text=0x7f07001e;
            public static final int common_google_play_services_wear_update_text=0x7f07001f;
            public static final int common_open_on_phone=0x7f070020;
            public static final int common_signin_button_text=0x7f070021;
            public static final int common_signin_button_text_long=0x7f070022;
            public static final int default_web_client_id=0x7f070057;
            public static final int fcm_fallback_notification_channel_label=0x7f070023;
            public static final int firebase_database_url=0x7f070058;
            public static final int gcm_defaultSenderId=0x7f070059;
            public static final int google_api_key=0x7f07005a;
            public static final int google_app_id=0x7f07005b;
            public static final int google_crash_reporting_api_key=0x7f07005c;
            public static final int google_storage_bucket=0x7f07005d;
            public static final int project_id=0x7f07005e;
            public static final int s1=0x7f070024;
            public static final int s2=0x7f070025;
            public static final int s3=0x7f070026;
            public static final int s4=0x7f070027;
            public static final int s5=0x7f070028;
            public static final int s6=0x7f070029;
            public static final int s7=0x7f07002a;
            public static final int search_menu_title=0x7f07002b;
            public static final int status_bar_notification_info_overflow=0x7f07002c;
            public static final int ucrop_error_input_data_is_absent=0x7f070030;
            public static final int ucrop_label_edit_photo=0x7f07002d;
            public static final int ucrop_label_original=0x7f07002e;
            public static final int ucrop_menu_crop=0x7f07002f;
            public static final int ucrop_mutate_exception_hint=0x7f070031;
        }
        public static final class style {
            public static final int AlertDialog_AppCompat=0x7f09008f;
            public static final int AlertDialog_AppCompat_Light=0x7f090090;
            public static final int Animation_AppCompat_Dialog=0x7f090091;
            public static final int Animation_AppCompat_DropDownUp=0x7f090092;
            public static final int Animation_AppCompat_Tooltip=0x7f090093;
            public static final int Animation_Catalyst_RedBox=0x7f090094;
            /**  Customize your theme here.
             */
            public static final int AppTheme=0x7f090095;
            public static final int Base_AlertDialog_AppCompat=0x7f090096;
            public static final int Base_AlertDialog_AppCompat_Light=0x7f090097;
            public static final int Base_Animation_AppCompat_Dialog=0x7f090098;
            public static final int Base_Animation_AppCompat_DropDownUp=0x7f090099;
            public static final int Base_Animation_AppCompat_Tooltip=0x7f09009a;
            public static final int Base_DialogWindowTitle_AppCompat=0x7f09009b;
            public static final int Base_DialogWindowTitleBackground_AppCompat=0x7f09009c;
            public static final int Base_TextAppearance_AppCompat=0x7f09001b;
            public static final int Base_TextAppearance_AppCompat_Body1=0x7f09001c;
            public static final int Base_TextAppearance_AppCompat_Body2=0x7f09001d;
            public static final int Base_TextAppearance_AppCompat_Button=0x7f09001e;
            public static final int Base_TextAppearance_AppCompat_Caption=0x7f09001f;
            public static final int Base_TextAppearance_AppCompat_Display1=0x7f090020;
            public static final int Base_TextAppearance_AppCompat_Display2=0x7f090021;
            public static final int Base_TextAppearance_AppCompat_Display3=0x7f090022;
            public static final int Base_TextAppearance_AppCompat_Display4=0x7f090023;
            public static final int Base_TextAppearance_AppCompat_Headline=0x7f090024;
            public static final int Base_TextAppearance_AppCompat_Inverse=0x7f090025;
            public static final int Base_TextAppearance_AppCompat_Large=0x7f090026;
            public static final int Base_TextAppearance_AppCompat_Large_Inverse=0x7f090027;
            public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Large=0x7f090028;
            public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small=0x7f090029;
            public static final int Base_TextAppearance_AppCompat_Medium=0x7f09002a;
            public static final int Base_TextAppearance_AppCompat_Medium_Inverse=0x7f09002b;
            public static final int Base_TextAppearance_AppCompat_Menu=0x7f09002c;
            public static final int Base_TextAppearance_AppCompat_SearchResult=0x7f09009d;
            public static final int Base_TextAppearance_AppCompat_SearchResult_Subtitle=0x7f09002d;
            public static final int Base_TextAppearance_AppCompat_SearchResult_Title=0x7f09002e;
            public static final int Base_TextAppearance_AppCompat_Small=0x7f09002f;
            public static final int Base_TextAppearance_AppCompat_Small_Inverse=0x7f090030;
            public static final int Base_TextAppearance_AppCompat_Subhead=0x7f090031;
            public static final int Base_TextAppearance_AppCompat_Subhead_Inverse=0x7f09009e;
            public static final int Base_TextAppearance_AppCompat_Title=0x7f090032;
            public static final int Base_TextAppearance_AppCompat_Title_Inverse=0x7f09009f;
            public static final int Base_TextAppearance_AppCompat_Tooltip=0x7f0900a0;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Menu=0x7f090080;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle=0x7f090033;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse=0x7f090034;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title=0x7f090035;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse=0x7f090036;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Subtitle=0x7f090037;
            public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Title=0x7f090038;
            public static final int Base_TextAppearance_AppCompat_Widget_Button=0x7f090039;
            public static final int Base_TextAppearance_AppCompat_Widget_Button_Borderless_Colored=0x7f090087;
            public static final int Base_TextAppearance_AppCompat_Widget_Button_Colored=0x7f090088;
            public static final int Base_TextAppearance_AppCompat_Widget_Button_Inverse=0x7f090081;
            public static final int Base_TextAppearance_AppCompat_Widget_DropDownItem=0x7f0900a1;
            public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Header=0x7f09003a;
            public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Large=0x7f09003b;
            public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Small=0x7f09003c;
            public static final int Base_TextAppearance_AppCompat_Widget_Switch=0x7f09003d;
            public static final int Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem=0x7f09003e;
            public static final int Base_TextAppearance_Widget_AppCompat_ExpandedMenu_Item=0x7f0900a2;
            public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Subtitle=0x7f09003f;
            public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Title=0x7f090040;
            public static final int Base_Theme_AppCompat=0x7f090041;
            public static final int Base_Theme_AppCompat_CompactMenu=0x7f0900a3;
            public static final int Base_Theme_AppCompat_Dialog=0x7f090042;
            public static final int Base_Theme_AppCompat_Dialog_Alert=0x7f0900a4;
            public static final int Base_Theme_AppCompat_Dialog_FixedSize=0x7f0900a5;
            public static final int Base_Theme_AppCompat_Dialog_MinWidth=0x7f0900a6;
            public static final int Base_Theme_AppCompat_DialogWhenLarge=0x7f090001;
            public static final int Base_Theme_AppCompat_Light=0x7f090043;
            public static final int Base_Theme_AppCompat_Light_DarkActionBar=0x7f0900a7;
            public static final int Base_Theme_AppCompat_Light_Dialog=0x7f090044;
            public static final int Base_Theme_AppCompat_Light_Dialog_Alert=0x7f0900a8;
            public static final int Base_Theme_AppCompat_Light_Dialog_FixedSize=0x7f0900a9;
            public static final int Base_Theme_AppCompat_Light_Dialog_MinWidth=0x7f0900aa;
            public static final int Base_Theme_AppCompat_Light_DialogWhenLarge=0x7f090002;
            public static final int Base_ThemeOverlay_AppCompat=0x7f0900ab;
            public static final int Base_ThemeOverlay_AppCompat_ActionBar=0x7f0900ac;
            public static final int Base_ThemeOverlay_AppCompat_Dark=0x7f0900ad;
            public static final int Base_ThemeOverlay_AppCompat_Dark_ActionBar=0x7f0900ae;
            public static final int Base_ThemeOverlay_AppCompat_Dialog=0x7f090045;
            public static final int Base_ThemeOverlay_AppCompat_Dialog_Alert=0x7f0900af;
            public static final int Base_ThemeOverlay_AppCompat_Light=0x7f0900b0;
            public static final int Base_V21_Theme_AppCompat=0x7f090046;
            public static final int Base_V21_Theme_AppCompat_Dialog=0x7f090047;
            public static final int Base_V21_Theme_AppCompat_Light=0x7f090048;
            public static final int Base_V21_Theme_AppCompat_Light_Dialog=0x7f090049;
            public static final int Base_V21_ThemeOverlay_AppCompat_Dialog=0x7f09004a;
            public static final int Base_V22_Theme_AppCompat=0x7f09007e;
            public static final int Base_V22_Theme_AppCompat_Light=0x7f09007f;
            public static final int Base_V23_Theme_AppCompat=0x7f090082;
            public static final int Base_V23_Theme_AppCompat_Light=0x7f090083;
            public static final int Base_V26_Theme_AppCompat=0x7f09008b;
            public static final int Base_V26_Theme_AppCompat_Light=0x7f09008c;
            public static final int Base_V26_Widget_AppCompat_Toolbar=0x7f09008d;
            public static final int Base_V7_Theme_AppCompat=0x7f0900b1;
            public static final int Base_V7_Theme_AppCompat_Dialog=0x7f0900b2;
            public static final int Base_V7_Theme_AppCompat_Light=0x7f0900b3;
            public static final int Base_V7_Theme_AppCompat_Light_Dialog=0x7f0900b4;
            public static final int Base_V7_ThemeOverlay_AppCompat_Dialog=0x7f0900b5;
            public static final int Base_V7_Widget_AppCompat_AutoCompleteTextView=0x7f0900b6;
            public static final int Base_V7_Widget_AppCompat_EditText=0x7f0900b7;
            public static final int Base_V7_Widget_AppCompat_Toolbar=0x7f0900b8;
            public static final int Base_Widget_AppCompat_ActionBar=0x7f0900b9;
            public static final int Base_Widget_AppCompat_ActionBar_Solid=0x7f0900ba;
            public static final int Base_Widget_AppCompat_ActionBar_TabBar=0x7f0900bb;
            public static final int Base_Widget_AppCompat_ActionBar_TabText=0x7f09004b;
            public static final int Base_Widget_AppCompat_ActionBar_TabView=0x7f09004c;
            public static final int Base_Widget_AppCompat_ActionButton=0x7f09004d;
            public static final int Base_Widget_AppCompat_ActionButton_CloseMode=0x7f09004e;
            public static final int Base_Widget_AppCompat_ActionButton_Overflow=0x7f09004f;
            public static final int Base_Widget_AppCompat_ActionMode=0x7f0900bc;
            public static final int Base_Widget_AppCompat_ActivityChooserView=0x7f0900bd;
            public static final int Base_Widget_AppCompat_AutoCompleteTextView=0x7f090050;
            public static final int Base_Widget_AppCompat_Button=0x7f090051;
            public static final int Base_Widget_AppCompat_Button_Borderless=0x7f090052;
            public static final int Base_Widget_AppCompat_Button_Borderless_Colored=0x7f090053;
            public static final int Base_Widget_AppCompat_Button_ButtonBar_AlertDialog=0x7f0900be;
            public static final int Base_Widget_AppCompat_Button_Colored=0x7f090084;
            public static final int Base_Widget_AppCompat_Button_Small=0x7f090054;
            public static final int Base_Widget_AppCompat_ButtonBar=0x7f090055;
            public static final int Base_Widget_AppCompat_ButtonBar_AlertDialog=0x7f0900bf;
            public static final int Base_Widget_AppCompat_CompoundButton_CheckBox=0x7f090056;
            public static final int Base_Widget_AppCompat_CompoundButton_RadioButton=0x7f090057;
            public static final int Base_Widget_AppCompat_CompoundButton_Switch=0x7f0900c0;
            public static final int Base_Widget_AppCompat_DrawerArrowToggle=0x7f090000;
            public static final int Base_Widget_AppCompat_DrawerArrowToggle_Common=0x7f0900c1;
            public static final int Base_Widget_AppCompat_DropDownItem_Spinner=0x7f090058;
            public static final int Base_Widget_AppCompat_EditText=0x7f090059;
            public static final int Base_Widget_AppCompat_ImageButton=0x7f09005a;
            public static final int Base_Widget_AppCompat_Light_ActionBar=0x7f0900c2;
            public static final int Base_Widget_AppCompat_Light_ActionBar_Solid=0x7f0900c3;
            public static final int Base_Widget_AppCompat_Light_ActionBar_TabBar=0x7f0900c4;
            public static final int Base_Widget_AppCompat_Light_ActionBar_TabText=0x7f09005b;
            public static final int Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse=0x7f09005c;
            public static final int Base_Widget_AppCompat_Light_ActionBar_TabView=0x7f09005d;
            public static final int Base_Widget_AppCompat_Light_PopupMenu=0x7f09005e;
            public static final int Base_Widget_AppCompat_Light_PopupMenu_Overflow=0x7f09005f;
            public static final int Base_Widget_AppCompat_ListMenuView=0x7f0900c5;
            public static final int Base_Widget_AppCompat_ListPopupWindow=0x7f090060;
            public static final int Base_Widget_AppCompat_ListView=0x7f090061;
            public static final int Base_Widget_AppCompat_ListView_DropDown=0x7f090062;
            public static final int Base_Widget_AppCompat_ListView_Menu=0x7f090063;
            public static final int Base_Widget_AppCompat_PopupMenu=0x7f090064;
            public static final int Base_Widget_AppCompat_PopupMenu_Overflow=0x7f090065;
            public static final int Base_Widget_AppCompat_PopupWindow=0x7f0900c6;
            public static final int Base_Widget_AppCompat_ProgressBar=0x7f090066;
            public static final int Base_Widget_AppCompat_ProgressBar_Horizontal=0x7f090067;
            public static final int Base_Widget_AppCompat_RatingBar=0x7f090068;
            public static final int Base_Widget_AppCompat_RatingBar_Indicator=0x7f090085;
            public static final int Base_Widget_AppCompat_RatingBar_Small=0x7f090086;
            public static final int Base_Widget_AppCompat_SearchView=0x7f0900c7;
            public static final int Base_Widget_AppCompat_SearchView_ActionBar=0x7f0900c8;
            public static final int Base_Widget_AppCompat_SeekBar=0x7f090069;
            public static final int Base_Widget_AppCompat_SeekBar_Discrete=0x7f0900c9;
            public static final int Base_Widget_AppCompat_Spinner=0x7f09006a;
            public static final int Base_Widget_AppCompat_Spinner_Underlined=0x7f090003;
            public static final int Base_Widget_AppCompat_TextView_SpinnerItem=0x7f09006b;
            public static final int Base_Widget_AppCompat_Toolbar=0x7f09008e;
            public static final int Base_Widget_AppCompat_Toolbar_Button_Navigation=0x7f09006c;
            public static final int CalendarDatePickerDialog=0x7f0900ca;
            public static final int CalendarDatePickerStyle=0x7f0900cb;
            public static final int ClockTimePickerDialog=0x7f0900cc;
            public static final int ClockTimePickerStyle=0x7f0900cd;
            public static final int DialogAnimationFade=0x7f0900ce;
            public static final int DialogAnimationSlide=0x7f0900cf;
            public static final int Platform_AppCompat=0x7f09006d;
            public static final int Platform_AppCompat_Light=0x7f09006e;
            public static final int Platform_ThemeOverlay_AppCompat=0x7f09006f;
            public static final int Platform_ThemeOverlay_AppCompat_Dark=0x7f090070;
            public static final int Platform_ThemeOverlay_AppCompat_Light=0x7f090071;
            public static final int Platform_V21_AppCompat=0x7f090072;
            public static final int Platform_V21_AppCompat_Light=0x7f090073;
            public static final int Platform_V25_AppCompat=0x7f090089;
            public static final int Platform_V25_AppCompat_Light=0x7f09008a;
            public static final int Platform_Widget_AppCompat_Spinner=0x7f0900d0;
            public static final int RtlOverlay_DialogWindowTitle_AppCompat=0x7f09000d;
            public static final int RtlOverlay_Widget_AppCompat_ActionBar_TitleItem=0x7f09000e;
            public static final int RtlOverlay_Widget_AppCompat_DialogTitle_Icon=0x7f09000f;
            public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem=0x7f090010;
            public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_InternalGroup=0x7f090011;
            public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Text=0x7f090012;
            public static final int RtlOverlay_Widget_AppCompat_Search_DropDown=0x7f090013;
            public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon1=0x7f090014;
            public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon2=0x7f090015;
            public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Query=0x7f090016;
            public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Text=0x7f090017;
            public static final int RtlOverlay_Widget_AppCompat_SearchView_MagIcon=0x7f090018;
            public static final int RtlUnderlay_Widget_AppCompat_ActionButton=0x7f090019;
            public static final int RtlUnderlay_Widget_AppCompat_ActionButton_Overflow=0x7f09001a;
            public static final int SpinnerDatePickerDialog=0x7f0900d1;
            public static final int SpinnerDatePickerStyle=0x7f0900d2;
            public static final int SpinnerTimePickerDialog=0x7f0900d3;
            public static final int SpinnerTimePickerStyle=0x7f0900d4;
            public static final int TextAppearance_AppCompat=0x7f0900d5;
            public static final int TextAppearance_AppCompat_Body1=0x7f0900d6;
            public static final int TextAppearance_AppCompat_Body2=0x7f0900d7;
            public static final int TextAppearance_AppCompat_Button=0x7f0900d8;
            public static final int TextAppearance_AppCompat_Caption=0x7f0900d9;
            public static final int TextAppearance_AppCompat_Display1=0x7f0900da;
            public static final int TextAppearance_AppCompat_Display2=0x7f0900db;
            public static final int TextAppearance_AppCompat_Display3=0x7f0900dc;
            public static final int TextAppearance_AppCompat_Display4=0x7f0900dd;
            public static final int TextAppearance_AppCompat_Headline=0x7f0900de;
            public static final int TextAppearance_AppCompat_Inverse=0x7f0900df;
            public static final int TextAppearance_AppCompat_Large=0x7f0900e0;
            public static final int TextAppearance_AppCompat_Large_Inverse=0x7f0900e1;
            public static final int TextAppearance_AppCompat_Light_SearchResult_Subtitle=0x7f0900e2;
            public static final int TextAppearance_AppCompat_Light_SearchResult_Title=0x7f0900e3;
            public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Large=0x7f0900e4;
            public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Small=0x7f0900e5;
            public static final int TextAppearance_AppCompat_Medium=0x7f0900e6;
            public static final int TextAppearance_AppCompat_Medium_Inverse=0x7f0900e7;
            public static final int TextAppearance_AppCompat_Menu=0x7f0900e8;
            public static final int TextAppearance_AppCompat_SearchResult_Subtitle=0x7f0900e9;
            public static final int TextAppearance_AppCompat_SearchResult_Title=0x7f0900ea;
            public static final int TextAppearance_AppCompat_Small=0x7f0900eb;
            public static final int TextAppearance_AppCompat_Small_Inverse=0x7f0900ec;
            public static final int TextAppearance_AppCompat_Subhead=0x7f0900ed;
            public static final int TextAppearance_AppCompat_Subhead_Inverse=0x7f0900ee;
            public static final int TextAppearance_AppCompat_Title=0x7f0900ef;
            public static final int TextAppearance_AppCompat_Title_Inverse=0x7f0900f0;
            public static final int TextAppearance_AppCompat_Tooltip=0x7f09000c;
            public static final int TextAppearance_AppCompat_Widget_ActionBar_Menu=0x7f0900f1;
            public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle=0x7f0900f2;
            public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse=0x7f0900f3;
            public static final int TextAppearance_AppCompat_Widget_ActionBar_Title=0x7f0900f4;
            public static final int TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse=0x7f0900f5;
            public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle=0x7f0900f6;
            public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle_Inverse=0x7f0900f7;
            public static final int TextAppearance_AppCompat_Widget_ActionMode_Title=0x7f0900f8;
            public static final int TextAppearance_AppCompat_Widget_ActionMode_Title_Inverse=0x7f0900f9;
            public static final int TextAppearance_AppCompat_Widget_Button=0x7f0900fa;
            public static final int TextAppearance_AppCompat_Widget_Button_Borderless_Colored=0x7f0900fb;
            public static final int TextAppearance_AppCompat_Widget_Button_Colored=0x7f0900fc;
            public static final int TextAppearance_AppCompat_Widget_Button_Inverse=0x7f0900fd;
            public static final int TextAppearance_AppCompat_Widget_DropDownItem=0x7f0900fe;
            public static final int TextAppearance_AppCompat_Widget_PopupMenu_Header=0x7f0900ff;
            public static final int TextAppearance_AppCompat_Widget_PopupMenu_Large=0x7f090100;
            public static final int TextAppearance_AppCompat_Widget_PopupMenu_Small=0x7f090101;
            public static final int TextAppearance_AppCompat_Widget_Switch=0x7f090102;
            public static final int TextAppearance_AppCompat_Widget_TextView_SpinnerItem=0x7f090103;
            public static final int TextAppearance_Compat_Notification=0x7f090074;
            public static final int TextAppearance_Compat_Notification_Info=0x7f090075;
            public static final int TextAppearance_Compat_Notification_Info_Media=0x7f090076;
            public static final int TextAppearance_Compat_Notification_Line2=0x7f090104;
            public static final int TextAppearance_Compat_Notification_Line2_Media=0x7f090105;
            public static final int TextAppearance_Compat_Notification_Media=0x7f090077;
            public static final int TextAppearance_Compat_Notification_Time=0x7f090078;
            public static final int TextAppearance_Compat_Notification_Time_Media=0x7f090079;
            public static final int TextAppearance_Compat_Notification_Title=0x7f09007a;
            public static final int TextAppearance_Compat_Notification_Title_Media=0x7f09007b;
            public static final int TextAppearance_Widget_AppCompat_ExpandedMenu_Item=0x7f090106;
            public static final int TextAppearance_Widget_AppCompat_Toolbar_Subtitle=0x7f090107;
            public static final int TextAppearance_Widget_AppCompat_Toolbar_Title=0x7f090108;
            public static final int Theme=0x7f090109;
            public static final int Theme_AppCompat=0x7f09010a;
            public static final int Theme_AppCompat_CompactMenu=0x7f09010b;
            public static final int Theme_AppCompat_DayNight=0x7f090004;
            public static final int Theme_AppCompat_DayNight_DarkActionBar=0x7f090005;
            public static final int Theme_AppCompat_DayNight_Dialog=0x7f090006;
            public static final int Theme_AppCompat_DayNight_Dialog_Alert=0x7f090007;
            public static final int Theme_AppCompat_DayNight_Dialog_MinWidth=0x7f090008;
            public static final int Theme_AppCompat_DayNight_DialogWhenLarge=0x7f090009;
            public static final int Theme_AppCompat_DayNight_NoActionBar=0x7f09000a;
            public static final int Theme_AppCompat_Dialog=0x7f09010c;
            public static final int Theme_AppCompat_Dialog_Alert=0x7f09010d;
            public static final int Theme_AppCompat_Dialog_MinWidth=0x7f09010e;
            public static final int Theme_AppCompat_DialogWhenLarge=0x7f09010f;
            public static final int Theme_AppCompat_Light=0x7f090110;
            public static final int Theme_AppCompat_Light_DarkActionBar=0x7f090111;
            public static final int Theme_AppCompat_Light_Dialog=0x7f090112;
            public static final int Theme_AppCompat_Light_Dialog_Alert=0x7f090113;
            public static final int Theme_AppCompat_Light_Dialog_MinWidth=0x7f090114;
            public static final int Theme_AppCompat_Light_DialogWhenLarge=0x7f090115;
            public static final int Theme_AppCompat_Light_NoActionBar=0x7f090116;
            public static final int Theme_AppCompat_NoActionBar=0x7f090117;
            public static final int Theme_AppInvite_Preview=0x7f090118;
            public static final int Theme_AppInvite_Preview_Base=0x7f09000b;
            public static final int Theme_Catalyst=0x7f090119;
            public static final int Theme_Catalyst_RedBox=0x7f09011a;
            public static final int Theme_FullScreenDialog=0x7f09011b;
            public static final int Theme_FullScreenDialogAnimatedFade=0x7f09011c;
            public static final int Theme_FullScreenDialogAnimatedSlide=0x7f09011d;
            public static final int Theme_IAPTheme=0x7f09011e;
            public static final int Theme_ReactNative_AppCompat_Light=0x7f09011f;
            public static final int Theme_ReactNative_AppCompat_Light_NoActionBar_FullScreen=0x7f090120;
            public static final int ThemeOverlay_AppCompat=0x7f090121;
            public static final int ThemeOverlay_AppCompat_ActionBar=0x7f090122;
            public static final int ThemeOverlay_AppCompat_Dark=0x7f090123;
            public static final int ThemeOverlay_AppCompat_Dark_ActionBar=0x7f090124;
            public static final int ThemeOverlay_AppCompat_Dialog=0x7f090125;
            public static final int ThemeOverlay_AppCompat_Dialog_Alert=0x7f090126;
            public static final int ThemeOverlay_AppCompat_Light=0x7f090127;
            public static final int Widget_AppCompat_ActionBar=0x7f090128;
            public static final int Widget_AppCompat_ActionBar_Solid=0x7f090129;
            public static final int Widget_AppCompat_ActionBar_TabBar=0x7f09012a;
            public static final int Widget_AppCompat_ActionBar_TabText=0x7f09012b;
            public static final int Widget_AppCompat_ActionBar_TabView=0x7f09012c;
            public static final int Widget_AppCompat_ActionButton=0x7f09012d;
            public static final int Widget_AppCompat_ActionButton_CloseMode=0x7f09012e;
            public static final int Widget_AppCompat_ActionButton_Overflow=0x7f09012f;
            public static final int Widget_AppCompat_ActionMode=0x7f090130;
            public static final int Widget_AppCompat_ActivityChooserView=0x7f090131;
            public static final int Widget_AppCompat_AutoCompleteTextView=0x7f090132;
            public static final int Widget_AppCompat_Button=0x7f090133;
            public static final int Widget_AppCompat_Button_Borderless=0x7f090134;
            public static final int Widget_AppCompat_Button_Borderless_Colored=0x7f090135;
            public static final int Widget_AppCompat_Button_ButtonBar_AlertDialog=0x7f090136;
            public static final int Widget_AppCompat_Button_Colored=0x7f090137;
            public static final int Widget_AppCompat_Button_Small=0x7f090138;
            public static final int Widget_AppCompat_ButtonBar=0x7f090139;
            public static final int Widget_AppCompat_ButtonBar_AlertDialog=0x7f09013a;
            public static final int Widget_AppCompat_CompoundButton_CheckBox=0x7f09013b;
            public static final int Widget_AppCompat_CompoundButton_RadioButton=0x7f09013c;
            public static final int Widget_AppCompat_CompoundButton_Switch=0x7f09013d;
            public static final int Widget_AppCompat_DrawerArrowToggle=0x7f09013e;
            public static final int Widget_AppCompat_DropDownItem_Spinner=0x7f09013f;
            public static final int Widget_AppCompat_EditText=0x7f090140;
            public static final int Widget_AppCompat_ImageButton=0x7f090141;
            public static final int Widget_AppCompat_Light_ActionBar=0x7f090142;
            public static final int Widget_AppCompat_Light_ActionBar_Solid=0x7f090143;
            public static final int Widget_AppCompat_Light_ActionBar_Solid_Inverse=0x7f090144;
            public static final int Widget_AppCompat_Light_ActionBar_TabBar=0x7f090145;
            public static final int Widget_AppCompat_Light_ActionBar_TabBar_Inverse=0x7f090146;
            public static final int Widget_AppCompat_Light_ActionBar_TabText=0x7f090147;
            public static final int Widget_AppCompat_Light_ActionBar_TabText_Inverse=0x7f090148;
            public static final int Widget_AppCompat_Light_ActionBar_TabView=0x7f090149;
            public static final int Widget_AppCompat_Light_ActionBar_TabView_Inverse=0x7f09014a;
            public static final int Widget_AppCompat_Light_ActionButton=0x7f09014b;
            public static final int Widget_AppCompat_Light_ActionButton_CloseMode=0x7f09014c;
            public static final int Widget_AppCompat_Light_ActionButton_Overflow=0x7f09014d;
            public static final int Widget_AppCompat_Light_ActionMode_Inverse=0x7f09014e;
            public static final int Widget_AppCompat_Light_ActivityChooserView=0x7f09014f;
            public static final int Widget_AppCompat_Light_AutoCompleteTextView=0x7f090150;
            public static final int Widget_AppCompat_Light_DropDownItem_Spinner=0x7f090151;
            public static final int Widget_AppCompat_Light_ListPopupWindow=0x7f090152;
            public static final int Widget_AppCompat_Light_ListView_DropDown=0x7f090153;
            public static final int Widget_AppCompat_Light_PopupMenu=0x7f090154;
            public static final int Widget_AppCompat_Light_PopupMenu_Overflow=0x7f090155;
            public static final int Widget_AppCompat_Light_SearchView=0x7f090156;
            public static final int Widget_AppCompat_Light_Spinner_DropDown_ActionBar=0x7f090157;
            public static final int Widget_AppCompat_ListMenuView=0x7f090158;
            public static final int Widget_AppCompat_ListPopupWindow=0x7f090159;
            public static final int Widget_AppCompat_ListView=0x7f09015a;
            public static final int Widget_AppCompat_ListView_DropDown=0x7f09015b;
            public static final int Widget_AppCompat_ListView_Menu=0x7f09015c;
            public static final int Widget_AppCompat_PopupMenu=0x7f09015d;
            public static final int Widget_AppCompat_PopupMenu_Overflow=0x7f09015e;
            public static final int Widget_AppCompat_PopupWindow=0x7f09015f;
            public static final int Widget_AppCompat_ProgressBar=0x7f090160;
            public static final int Widget_AppCompat_ProgressBar_Horizontal=0x7f090161;
            public static final int Widget_AppCompat_RatingBar=0x7f090162;
            public static final int Widget_AppCompat_RatingBar_Indicator=0x7f090163;
            public static final int Widget_AppCompat_RatingBar_Small=0x7f090164;
            public static final int Widget_AppCompat_SearchView=0x7f090165;
            public static final int Widget_AppCompat_SearchView_ActionBar=0x7f090166;
            public static final int Widget_AppCompat_SeekBar=0x7f090167;
            public static final int Widget_AppCompat_SeekBar_Discrete=0x7f090168;
            public static final int Widget_AppCompat_Spinner=0x7f090169;
            public static final int Widget_AppCompat_Spinner_DropDown=0x7f09016a;
            public static final int Widget_AppCompat_Spinner_DropDown_ActionBar=0x7f09016b;
            public static final int Widget_AppCompat_Spinner_Underlined=0x7f09016c;
            public static final int Widget_AppCompat_TextView_SpinnerItem=0x7f09016d;
            public static final int Widget_AppCompat_Toolbar=0x7f09016e;
            public static final int Widget_AppCompat_Toolbar_Button_Navigation=0x7f09016f;
            public static final int Widget_Compat_NotificationActionContainer=0x7f09007c;
            public static final int Widget_Compat_NotificationActionText=0x7f09007d;
            public static final int Widget_Support_CoordinatorLayout=0x7f090170;
            public static final int redboxButton=0x7f090171;
            public static final int ucrop_ImageViewWidgetIcon=0x7f090172;
            public static final int ucrop_TextViewCropAspectRatio=0x7f090173;
            public static final int ucrop_TextViewWidgetText=0x7f090174;
            public static final int ucrop_WrapperIconState=0x7f090175;
            public static final int ucrop_WrapperRotateButton=0x7f090176;
        }
        public static final class xml {
            public static final int preferences=0x7f060000;
            public static final int provider_paths=0x7f060001;
        }
        public static final class styleable {
            /** Attributes that can be used with a ActionBar.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ActionBar_background com.sirius:background}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_backgroundSplit com.sirius:backgroundSplit}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_backgroundStacked com.sirius:backgroundStacked}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_contentInsetEnd com.sirius:contentInsetEnd}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_contentInsetEndWithActions com.sirius:contentInsetEndWithActions}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_contentInsetLeft com.sirius:contentInsetLeft}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_contentInsetRight com.sirius:contentInsetRight}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_contentInsetStart com.sirius:contentInsetStart}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_contentInsetStartWithNavigation com.sirius:contentInsetStartWithNavigation}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_customNavigationLayout com.sirius:customNavigationLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_displayOptions com.sirius:displayOptions}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_divider com.sirius:divider}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_elevation com.sirius:elevation}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_height com.sirius:height}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_hideOnContentScroll com.sirius:hideOnContentScroll}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_homeAsUpIndicator com.sirius:homeAsUpIndicator}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_homeLayout com.sirius:homeLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_icon com.sirius:icon}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_indeterminateProgressStyle com.sirius:indeterminateProgressStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_itemPadding com.sirius:itemPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_logo com.sirius:logo}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_navigationMode com.sirius:navigationMode}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_popupTheme com.sirius:popupTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_progressBarPadding com.sirius:progressBarPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_progressBarStyle com.sirius:progressBarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_subtitle com.sirius:subtitle}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_subtitleTextStyle com.sirius:subtitleTextStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_title com.sirius:title}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionBar_titleTextStyle com.sirius:titleTextStyle}</code></td><td></td></tr>
               </table>
               @see #ActionBar_background
               @see #ActionBar_backgroundSplit
               @see #ActionBar_backgroundStacked
               @see #ActionBar_contentInsetEnd
               @see #ActionBar_contentInsetEndWithActions
               @see #ActionBar_contentInsetLeft
               @see #ActionBar_contentInsetRight
               @see #ActionBar_contentInsetStart
               @see #ActionBar_contentInsetStartWithNavigation
               @see #ActionBar_customNavigationLayout
               @see #ActionBar_displayOptions
               @see #ActionBar_divider
               @see #ActionBar_elevation
               @see #ActionBar_height
               @see #ActionBar_hideOnContentScroll
               @see #ActionBar_homeAsUpIndicator
               @see #ActionBar_homeLayout
               @see #ActionBar_icon
               @see #ActionBar_indeterminateProgressStyle
               @see #ActionBar_itemPadding
               @see #ActionBar_logo
               @see #ActionBar_navigationMode
               @see #ActionBar_popupTheme
               @see #ActionBar_progressBarPadding
               @see #ActionBar_progressBarStyle
               @see #ActionBar_subtitle
               @see #ActionBar_subtitleTextStyle
               @see #ActionBar_title
               @see #ActionBar_titleTextStyle
             */
            public static final int[] ActionBar = {
                0x7f010002, 0x7f010004, 0x7f010005, 0x7f010006,
                0x7f010007, 0x7f010008, 0x7f010009, 0x7f01000a,
                0x7f01000b, 0x7f01000c, 0x7f01000d, 0x7f01000e,
                0x7f01000f, 0x7f010010, 0x7f010011, 0x7f010012,
                0x7f010013, 0x7f010014, 0x7f010015, 0x7f010016,
                0x7f010017, 0x7f010018, 0x7f010019, 0x7f01001a,
                0x7f01001b, 0x7f01001c, 0x7f01001d, 0x7f01001e,
                0x7f010068
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#background}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:background
            */
            public static final int ActionBar_background = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#backgroundSplit}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:backgroundSplit
            */
            public static final int ActionBar_backgroundSplit = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#backgroundStacked}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:backgroundStacked
            */
            public static final int ActionBar_backgroundStacked = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetEnd}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetEnd
            */
            public static final int ActionBar_contentInsetEnd = 21;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetEndWithActions}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetEndWithActions
            */
            public static final int ActionBar_contentInsetEndWithActions = 25;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetLeft}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetLeft
            */
            public static final int ActionBar_contentInsetLeft = 22;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetRight}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetRight
            */
            public static final int ActionBar_contentInsetRight = 23;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetStart}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetStart
            */
            public static final int ActionBar_contentInsetStart = 20;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetStartWithNavigation}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetStartWithNavigation
            */
            public static final int ActionBar_contentInsetStartWithNavigation = 24;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#customNavigationLayout}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:customNavigationLayout
            */
            public static final int ActionBar_customNavigationLayout = 13;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#displayOptions}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>useLogo</code></td><td>0x1</td><td></td></tr>
    <tr><td><code>showHome</code></td><td>0x2</td><td></td></tr>
    <tr><td><code>homeAsUp</code></td><td>0x4</td><td></td></tr>
    <tr><td><code>showTitle</code></td><td>0x8</td><td></td></tr>
    <tr><td><code>showCustom</code></td><td>0x10</td><td></td></tr>
    <tr><td><code>disableHome</code></td><td>0x20</td><td></td></tr>
    </table>
              @attr name com.sirius:displayOptions
            */
            public static final int ActionBar_displayOptions = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#divider}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:divider
            */
            public static final int ActionBar_divider = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#elevation}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:elevation
            */
            public static final int ActionBar_elevation = 26;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#height}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:height
            */
            public static final int ActionBar_height = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#hideOnContentScroll}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:hideOnContentScroll
            */
            public static final int ActionBar_hideOnContentScroll = 19;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#homeAsUpIndicator}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:homeAsUpIndicator
            */
            public static final int ActionBar_homeAsUpIndicator = 28;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#homeLayout}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:homeLayout
            */
            public static final int ActionBar_homeLayout = 14;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#icon}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:icon
            */
            public static final int ActionBar_icon = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#indeterminateProgressStyle}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:indeterminateProgressStyle
            */
            public static final int ActionBar_indeterminateProgressStyle = 16;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#itemPadding}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:itemPadding
            */
            public static final int ActionBar_itemPadding = 18;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#logo}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:logo
            */
            public static final int ActionBar_logo = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#navigationMode}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>normal</code></td><td>0</td><td></td></tr>
    <tr><td><code>listMode</code></td><td>1</td><td></td></tr>
    <tr><td><code>tabMode</code></td><td>2</td><td></td></tr>
    </table>
              @attr name com.sirius:navigationMode
            */
            public static final int ActionBar_navigationMode = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#popupTheme}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:popupTheme
            */
            public static final int ActionBar_popupTheme = 27;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#progressBarPadding}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:progressBarPadding
            */
            public static final int ActionBar_progressBarPadding = 17;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#progressBarStyle}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:progressBarStyle
            */
            public static final int ActionBar_progressBarStyle = 15;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subtitle}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:subtitle
            */
            public static final int ActionBar_subtitle = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subtitleTextStyle}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:subtitleTextStyle
            */
            public static final int ActionBar_subtitleTextStyle = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#title}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:title
            */
            public static final int ActionBar_title = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleTextStyle}
              attribute's value can be found in the {@link #ActionBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:titleTextStyle
            */
            public static final int ActionBar_titleTextStyle = 5;
            /** Attributes that can be used with a ActionBarLayout.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ActionBarLayout_android_layout_gravity android:layout_gravity}</code></td><td></td></tr>
               </table>
               @see #ActionBarLayout_android_layout_gravity
             */
            public static final int[] ActionBarLayout = {
                0x010100b3
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout_gravity}
              attribute's value can be found in the {@link #ActionBarLayout} array.
              @attr name android:layout_gravity
            */
            public static final int ActionBarLayout_android_layout_gravity = 0;
            /** Attributes that can be used with a ActionMenuItemView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ActionMenuItemView_android_minWidth android:minWidth}</code></td><td></td></tr>
               </table>
               @see #ActionMenuItemView_android_minWidth
             */
            public static final int[] ActionMenuItemView = {
                0x0101013f
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#minWidth}
              attribute's value can be found in the {@link #ActionMenuItemView} array.
              @attr name android:minWidth
            */
            public static final int ActionMenuItemView_android_minWidth = 0;
            /** Attributes that can be used with a ActionMenuView.
             */
            public static final int[] ActionMenuView = {

            };
            /** Attributes that can be used with a ActionMode.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ActionMode_background com.sirius:background}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionMode_backgroundSplit com.sirius:backgroundSplit}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionMode_closeItemLayout com.sirius:closeItemLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionMode_height com.sirius:height}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionMode_subtitleTextStyle com.sirius:subtitleTextStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #ActionMode_titleTextStyle com.sirius:titleTextStyle}</code></td><td></td></tr>
               </table>
               @see #ActionMode_background
               @see #ActionMode_backgroundSplit
               @see #ActionMode_closeItemLayout
               @see #ActionMode_height
               @see #ActionMode_subtitleTextStyle
               @see #ActionMode_titleTextStyle
             */
            public static final int[] ActionMode = {
                0x7f010002, 0x7f010008, 0x7f010009, 0x7f01000d,
                0x7f01000f, 0x7f01001f
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#background}
              attribute's value can be found in the {@link #ActionMode} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:background
            */
            public static final int ActionMode_background = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#backgroundSplit}
              attribute's value can be found in the {@link #ActionMode} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:backgroundSplit
            */
            public static final int ActionMode_backgroundSplit = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#closeItemLayout}
              attribute's value can be found in the {@link #ActionMode} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:closeItemLayout
            */
            public static final int ActionMode_closeItemLayout = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#height}
              attribute's value can be found in the {@link #ActionMode} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:height
            */
            public static final int ActionMode_height = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subtitleTextStyle}
              attribute's value can be found in the {@link #ActionMode} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:subtitleTextStyle
            */
            public static final int ActionMode_subtitleTextStyle = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleTextStyle}
              attribute's value can be found in the {@link #ActionMode} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:titleTextStyle
            */
            public static final int ActionMode_titleTextStyle = 1;
            /** Attributes that can be used with a ActivityChooserView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ActivityChooserView_expandActivityOverflowButtonDrawable com.sirius:expandActivityOverflowButtonDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #ActivityChooserView_initialActivityCount com.sirius:initialActivityCount}</code></td><td></td></tr>
               </table>
               @see #ActivityChooserView_expandActivityOverflowButtonDrawable
               @see #ActivityChooserView_initialActivityCount
             */
            public static final int[] ActivityChooserView = {
                0x7f010020, 0x7f010021
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#expandActivityOverflowButtonDrawable}
              attribute's value can be found in the {@link #ActivityChooserView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:expandActivityOverflowButtonDrawable
            */
            public static final int ActivityChooserView_expandActivityOverflowButtonDrawable = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#initialActivityCount}
              attribute's value can be found in the {@link #ActivityChooserView} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:initialActivityCount
            */
            public static final int ActivityChooserView_initialActivityCount = 0;
            /** Attributes that can be used with a AdsAttrs.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AdsAttrs_adSize com.sirius:adSize}</code></td><td></td></tr>
               <tr><td><code>{@link #AdsAttrs_adSizes com.sirius:adSizes}</code></td><td></td></tr>
               <tr><td><code>{@link #AdsAttrs_adUnitId com.sirius:adUnitId}</code></td><td></td></tr>
               </table>
               @see #AdsAttrs_adSize
               @see #AdsAttrs_adSizes
               @see #AdsAttrs_adUnitId
             */
            public static final int[] AdsAttrs = {
                0x7f010022, 0x7f010023, 0x7f010024
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#adSize}
              attribute's value can be found in the {@link #AdsAttrs} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:adSize
            */
            public static final int AdsAttrs_adSize = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#adSizes}
              attribute's value can be found in the {@link #AdsAttrs} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:adSizes
            */
            public static final int AdsAttrs_adSizes = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#adUnitId}
              attribute's value can be found in the {@link #AdsAttrs} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:adUnitId
            */
            public static final int AdsAttrs_adUnitId = 2;
            /** Attributes that can be used with a AlertDialog.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AlertDialog_android_layout android:layout}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_buttonIconDimen com.sirius:buttonIconDimen}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_buttonPanelSideLayout com.sirius:buttonPanelSideLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_listItemLayout com.sirius:listItemLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_listLayout com.sirius:listLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_multiChoiceItemLayout com.sirius:multiChoiceItemLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_showTitle com.sirius:showTitle}</code></td><td></td></tr>
               <tr><td><code>{@link #AlertDialog_singleChoiceItemLayout com.sirius:singleChoiceItemLayout}</code></td><td></td></tr>
               </table>
               @see #AlertDialog_android_layout
               @see #AlertDialog_buttonIconDimen
               @see #AlertDialog_buttonPanelSideLayout
               @see #AlertDialog_listItemLayout
               @see #AlertDialog_listLayout
               @see #AlertDialog_multiChoiceItemLayout
               @see #AlertDialog_showTitle
               @see #AlertDialog_singleChoiceItemLayout
             */
            public static final int[] AlertDialog = {
                0x010100f2, 0x7f010025, 0x7f010026, 0x7f010027,
                0x7f010028, 0x7f010029, 0x7f01002a, 0x7f01002b
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout}
              attribute's value can be found in the {@link #AlertDialog} array.
              @attr name android:layout
            */
            public static final int AlertDialog_android_layout = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonIconDimen}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:buttonIconDimen
            */
            public static final int AlertDialog_buttonIconDimen = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonPanelSideLayout}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonPanelSideLayout
            */
            public static final int AlertDialog_buttonPanelSideLayout = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listItemLayout}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:listItemLayout
            */
            public static final int AlertDialog_listItemLayout = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listLayout}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:listLayout
            */
            public static final int AlertDialog_listLayout = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#multiChoiceItemLayout}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:multiChoiceItemLayout
            */
            public static final int AlertDialog_multiChoiceItemLayout = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#showTitle}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:showTitle
            */
            public static final int AlertDialog_showTitle = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#singleChoiceItemLayout}
              attribute's value can be found in the {@link #AlertDialog} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:singleChoiceItemLayout
            */
            public static final int AlertDialog_singleChoiceItemLayout = 4;
            /** Attributes that can be used with a AppCompatImageView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AppCompatImageView_android_src android:src}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatImageView_srcCompat com.sirius:srcCompat}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatImageView_tint com.sirius:tint}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatImageView_tintMode com.sirius:tintMode}</code></td><td></td></tr>
               </table>
               @see #AppCompatImageView_android_src
               @see #AppCompatImageView_srcCompat
               @see #AppCompatImageView_tint
               @see #AppCompatImageView_tintMode
             */
            public static final int[] AppCompatImageView = {
                0x01010119, 0x7f01002c, 0x7f01002d, 0x7f01002e
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#src}
              attribute's value can be found in the {@link #AppCompatImageView} array.
              @attr name android:src
            */
            public static final int AppCompatImageView_android_src = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#srcCompat}
              attribute's value can be found in the {@link #AppCompatImageView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:srcCompat
            */
            public static final int AppCompatImageView_srcCompat = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tint}
              attribute's value can be found in the {@link #AppCompatImageView} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:tint
            */
            public static final int AppCompatImageView_tint = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tintMode}
              attribute's value can be found in the {@link #AppCompatImageView} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:tintMode
            */
            public static final int AppCompatImageView_tintMode = 3;
            /** Attributes that can be used with a AppCompatSeekBar.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AppCompatSeekBar_android_thumb android:thumb}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatSeekBar_tickMark com.sirius:tickMark}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatSeekBar_tickMarkTint com.sirius:tickMarkTint}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatSeekBar_tickMarkTintMode com.sirius:tickMarkTintMode}</code></td><td></td></tr>
               </table>
               @see #AppCompatSeekBar_android_thumb
               @see #AppCompatSeekBar_tickMark
               @see #AppCompatSeekBar_tickMarkTint
               @see #AppCompatSeekBar_tickMarkTintMode
             */
            public static final int[] AppCompatSeekBar = {
                0x01010142, 0x7f01002f, 0x7f010030, 0x7f010031
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#thumb}
              attribute's value can be found in the {@link #AppCompatSeekBar} array.
              @attr name android:thumb
            */
            public static final int AppCompatSeekBar_android_thumb = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tickMark}
              attribute's value can be found in the {@link #AppCompatSeekBar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:tickMark
            */
            public static final int AppCompatSeekBar_tickMark = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tickMarkTint}
              attribute's value can be found in the {@link #AppCompatSeekBar} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:tickMarkTint
            */
            public static final int AppCompatSeekBar_tickMarkTint = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tickMarkTintMode}
              attribute's value can be found in the {@link #AppCompatSeekBar} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:tickMarkTintMode
            */
            public static final int AppCompatSeekBar_tickMarkTintMode = 3;
            /** Attributes that can be used with a AppCompatTextHelper.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_drawableBottom android:drawableBottom}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_drawableEnd android:drawableEnd}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_drawableLeft android:drawableLeft}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_drawableRight android:drawableRight}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_drawableStart android:drawableStart}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_drawableTop android:drawableTop}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextHelper_android_textAppearance android:textAppearance}</code></td><td></td></tr>
               </table>
               @see #AppCompatTextHelper_android_drawableBottom
               @see #AppCompatTextHelper_android_drawableEnd
               @see #AppCompatTextHelper_android_drawableLeft
               @see #AppCompatTextHelper_android_drawableRight
               @see #AppCompatTextHelper_android_drawableStart
               @see #AppCompatTextHelper_android_drawableTop
               @see #AppCompatTextHelper_android_textAppearance
             */
            public static final int[] AppCompatTextHelper = {
                0x01010034, 0x0101016d, 0x0101016e, 0x0101016f,
                0x01010170, 0x01010392, 0x01010393
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#drawableBottom}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:drawableBottom
            */
            public static final int AppCompatTextHelper_android_drawableBottom = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#drawableEnd}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:drawableEnd
            */
            public static final int AppCompatTextHelper_android_drawableEnd = 6;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#drawableLeft}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:drawableLeft
            */
            public static final int AppCompatTextHelper_android_drawableLeft = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#drawableRight}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:drawableRight
            */
            public static final int AppCompatTextHelper_android_drawableRight = 4;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#drawableStart}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:drawableStart
            */
            public static final int AppCompatTextHelper_android_drawableStart = 5;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#drawableTop}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:drawableTop
            */
            public static final int AppCompatTextHelper_android_drawableTop = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textAppearance}
              attribute's value can be found in the {@link #AppCompatTextHelper} array.
              @attr name android:textAppearance
            */
            public static final int AppCompatTextHelper_android_textAppearance = 0;
            /** Attributes that can be used with a AppCompatTextView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AppCompatTextView_android_textAppearance android:textAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_autoSizeMaxTextSize com.sirius:autoSizeMaxTextSize}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_autoSizeMinTextSize com.sirius:autoSizeMinTextSize}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_autoSizePresetSizes com.sirius:autoSizePresetSizes}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_autoSizeStepGranularity com.sirius:autoSizeStepGranularity}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_autoSizeTextType com.sirius:autoSizeTextType}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_fontFamily com.sirius:fontFamily}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTextView_textAllCaps com.sirius:textAllCaps}</code></td><td></td></tr>
               </table>
               @see #AppCompatTextView_android_textAppearance
               @see #AppCompatTextView_autoSizeMaxTextSize
               @see #AppCompatTextView_autoSizeMinTextSize
               @see #AppCompatTextView_autoSizePresetSizes
               @see #AppCompatTextView_autoSizeStepGranularity
               @see #AppCompatTextView_autoSizeTextType
               @see #AppCompatTextView_fontFamily
               @see #AppCompatTextView_textAllCaps
             */
            public static final int[] AppCompatTextView = {
                0x01010034, 0x7f010032, 0x7f010033, 0x7f010034,
                0x7f010035, 0x7f010036, 0x7f010037, 0x7f010038
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textAppearance}
              attribute's value can be found in the {@link #AppCompatTextView} array.
              @attr name android:textAppearance
            */
            public static final int AppCompatTextView_android_textAppearance = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#autoSizeMaxTextSize}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:autoSizeMaxTextSize
            */
            public static final int AppCompatTextView_autoSizeMaxTextSize = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#autoSizeMinTextSize}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:autoSizeMinTextSize
            */
            public static final int AppCompatTextView_autoSizeMinTextSize = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#autoSizePresetSizes}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:autoSizePresetSizes
            */
            public static final int AppCompatTextView_autoSizePresetSizes = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#autoSizeStepGranularity}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:autoSizeStepGranularity
            */
            public static final int AppCompatTextView_autoSizeStepGranularity = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#autoSizeTextType}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>uniform</code></td><td>1</td><td></td></tr>
    </table>
              @attr name com.sirius:autoSizeTextType
            */
            public static final int AppCompatTextView_autoSizeTextType = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontFamily}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fontFamily
            */
            public static final int AppCompatTextView_fontFamily = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAllCaps}
              attribute's value can be found in the {@link #AppCompatTextView} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
              @attr name com.sirius:textAllCaps
            */
            public static final int AppCompatTextView_textAllCaps = 1;
            /** Attributes that can be used with a AppCompatTheme.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarDivider com.sirius:actionBarDivider}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarItemBackground com.sirius:actionBarItemBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarPopupTheme com.sirius:actionBarPopupTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarSize com.sirius:actionBarSize}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarSplitStyle com.sirius:actionBarSplitStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarStyle com.sirius:actionBarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarTabBarStyle com.sirius:actionBarTabBarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarTabStyle com.sirius:actionBarTabStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarTabTextStyle com.sirius:actionBarTabTextStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarTheme com.sirius:actionBarTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionBarWidgetTheme com.sirius:actionBarWidgetTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionButtonStyle com.sirius:actionButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionDropDownStyle com.sirius:actionDropDownStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionMenuTextAppearance com.sirius:actionMenuTextAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionMenuTextColor com.sirius:actionMenuTextColor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeBackground com.sirius:actionModeBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeCloseButtonStyle com.sirius:actionModeCloseButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeCloseDrawable com.sirius:actionModeCloseDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeCopyDrawable com.sirius:actionModeCopyDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeCutDrawable com.sirius:actionModeCutDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeFindDrawable com.sirius:actionModeFindDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModePasteDrawable com.sirius:actionModePasteDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModePopupWindowStyle com.sirius:actionModePopupWindowStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeSelectAllDrawable com.sirius:actionModeSelectAllDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeShareDrawable com.sirius:actionModeShareDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeSplitBackground com.sirius:actionModeSplitBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeStyle com.sirius:actionModeStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionModeWebSearchDrawable com.sirius:actionModeWebSearchDrawable}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionOverflowButtonStyle com.sirius:actionOverflowButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_actionOverflowMenuStyle com.sirius:actionOverflowMenuStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_activityChooserViewStyle com.sirius:activityChooserViewStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_alertDialogButtonGroupStyle com.sirius:alertDialogButtonGroupStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_alertDialogCenterButtons com.sirius:alertDialogCenterButtons}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_alertDialogStyle com.sirius:alertDialogStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_alertDialogTheme com.sirius:alertDialogTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_android_windowAnimationStyle android:windowAnimationStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_android_windowIsFloating android:windowIsFloating}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_autoCompleteTextViewStyle com.sirius:autoCompleteTextViewStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_borderlessButtonStyle com.sirius:borderlessButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonBarButtonStyle com.sirius:buttonBarButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonBarNegativeButtonStyle com.sirius:buttonBarNegativeButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonBarNeutralButtonStyle com.sirius:buttonBarNeutralButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonBarPositiveButtonStyle com.sirius:buttonBarPositiveButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonBarStyle com.sirius:buttonBarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonStyle com.sirius:buttonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_buttonStyleSmall com.sirius:buttonStyleSmall}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_checkboxStyle com.sirius:checkboxStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_checkedTextViewStyle com.sirius:checkedTextViewStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorAccent com.sirius:colorAccent}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorBackgroundFloating com.sirius:colorBackgroundFloating}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorButtonNormal com.sirius:colorButtonNormal}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorControlActivated com.sirius:colorControlActivated}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorControlHighlight com.sirius:colorControlHighlight}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorControlNormal com.sirius:colorControlNormal}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorError com.sirius:colorError}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorPrimary com.sirius:colorPrimary}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorPrimaryDark com.sirius:colorPrimaryDark}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_colorSwitchThumbNormal com.sirius:colorSwitchThumbNormal}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_controlBackground com.sirius:controlBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_dialogPreferredPadding com.sirius:dialogPreferredPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_dialogTheme com.sirius:dialogTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_dividerHorizontal com.sirius:dividerHorizontal}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_dividerVertical com.sirius:dividerVertical}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_dropDownListViewStyle com.sirius:dropDownListViewStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_dropdownListPreferredItemHeight com.sirius:dropdownListPreferredItemHeight}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_editTextBackground com.sirius:editTextBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_editTextColor com.sirius:editTextColor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_editTextStyle com.sirius:editTextStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_homeAsUpIndicator com.sirius:homeAsUpIndicator}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_imageButtonStyle com.sirius:imageButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listChoiceBackgroundIndicator com.sirius:listChoiceBackgroundIndicator}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listDividerAlertDialog com.sirius:listDividerAlertDialog}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listMenuViewStyle com.sirius:listMenuViewStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listPopupWindowStyle com.sirius:listPopupWindowStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listPreferredItemHeight com.sirius:listPreferredItemHeight}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listPreferredItemHeightLarge com.sirius:listPreferredItemHeightLarge}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listPreferredItemHeightSmall com.sirius:listPreferredItemHeightSmall}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listPreferredItemPaddingLeft com.sirius:listPreferredItemPaddingLeft}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_listPreferredItemPaddingRight com.sirius:listPreferredItemPaddingRight}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_panelBackground com.sirius:panelBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_panelMenuListTheme com.sirius:panelMenuListTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_panelMenuListWidth com.sirius:panelMenuListWidth}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_popupMenuStyle com.sirius:popupMenuStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_popupWindowStyle com.sirius:popupWindowStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_radioButtonStyle com.sirius:radioButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_ratingBarStyle com.sirius:ratingBarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_ratingBarStyleIndicator com.sirius:ratingBarStyleIndicator}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_ratingBarStyleSmall com.sirius:ratingBarStyleSmall}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_searchViewStyle com.sirius:searchViewStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_seekBarStyle com.sirius:seekBarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_selectableItemBackground com.sirius:selectableItemBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_selectableItemBackgroundBorderless com.sirius:selectableItemBackgroundBorderless}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_spinnerDropDownItemStyle com.sirius:spinnerDropDownItemStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_spinnerStyle com.sirius:spinnerStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_switchStyle com.sirius:switchStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceLargePopupMenu com.sirius:textAppearanceLargePopupMenu}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceListItem com.sirius:textAppearanceListItem}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceListItemSecondary com.sirius:textAppearanceListItemSecondary}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceListItemSmall com.sirius:textAppearanceListItemSmall}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearancePopupMenuHeader com.sirius:textAppearancePopupMenuHeader}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceSearchResultSubtitle com.sirius:textAppearanceSearchResultSubtitle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceSearchResultTitle com.sirius:textAppearanceSearchResultTitle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textAppearanceSmallPopupMenu com.sirius:textAppearanceSmallPopupMenu}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textColorAlertDialogListItem com.sirius:textColorAlertDialogListItem}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_textColorSearchUrl com.sirius:textColorSearchUrl}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_toolbarNavigationButtonStyle com.sirius:toolbarNavigationButtonStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_toolbarStyle com.sirius:toolbarStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_tooltipForegroundColor com.sirius:tooltipForegroundColor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_tooltipFrameBackground com.sirius:tooltipFrameBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_viewInflaterClass com.sirius:viewInflaterClass}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowActionBar com.sirius:windowActionBar}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowActionBarOverlay com.sirius:windowActionBarOverlay}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowActionModeOverlay com.sirius:windowActionModeOverlay}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowFixedHeightMajor com.sirius:windowFixedHeightMajor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowFixedHeightMinor com.sirius:windowFixedHeightMinor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowFixedWidthMajor com.sirius:windowFixedWidthMajor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowFixedWidthMinor com.sirius:windowFixedWidthMinor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowMinWidthMajor com.sirius:windowMinWidthMajor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowMinWidthMinor com.sirius:windowMinWidthMinor}</code></td><td></td></tr>
               <tr><td><code>{@link #AppCompatTheme_windowNoTitle com.sirius:windowNoTitle}</code></td><td></td></tr>
               </table>
               @see #AppCompatTheme_actionBarDivider
               @see #AppCompatTheme_actionBarItemBackground
               @see #AppCompatTheme_actionBarPopupTheme
               @see #AppCompatTheme_actionBarSize
               @see #AppCompatTheme_actionBarSplitStyle
               @see #AppCompatTheme_actionBarStyle
               @see #AppCompatTheme_actionBarTabBarStyle
               @see #AppCompatTheme_actionBarTabStyle
               @see #AppCompatTheme_actionBarTabTextStyle
               @see #AppCompatTheme_actionBarTheme
               @see #AppCompatTheme_actionBarWidgetTheme
               @see #AppCompatTheme_actionButtonStyle
               @see #AppCompatTheme_actionDropDownStyle
               @see #AppCompatTheme_actionMenuTextAppearance
               @see #AppCompatTheme_actionMenuTextColor
               @see #AppCompatTheme_actionModeBackground
               @see #AppCompatTheme_actionModeCloseButtonStyle
               @see #AppCompatTheme_actionModeCloseDrawable
               @see #AppCompatTheme_actionModeCopyDrawable
               @see #AppCompatTheme_actionModeCutDrawable
               @see #AppCompatTheme_actionModeFindDrawable
               @see #AppCompatTheme_actionModePasteDrawable
               @see #AppCompatTheme_actionModePopupWindowStyle
               @see #AppCompatTheme_actionModeSelectAllDrawable
               @see #AppCompatTheme_actionModeShareDrawable
               @see #AppCompatTheme_actionModeSplitBackground
               @see #AppCompatTheme_actionModeStyle
               @see #AppCompatTheme_actionModeWebSearchDrawable
               @see #AppCompatTheme_actionOverflowButtonStyle
               @see #AppCompatTheme_actionOverflowMenuStyle
               @see #AppCompatTheme_activityChooserViewStyle
               @see #AppCompatTheme_alertDialogButtonGroupStyle
               @see #AppCompatTheme_alertDialogCenterButtons
               @see #AppCompatTheme_alertDialogStyle
               @see #AppCompatTheme_alertDialogTheme
               @see #AppCompatTheme_android_windowAnimationStyle
               @see #AppCompatTheme_android_windowIsFloating
               @see #AppCompatTheme_autoCompleteTextViewStyle
               @see #AppCompatTheme_borderlessButtonStyle
               @see #AppCompatTheme_buttonBarButtonStyle
               @see #AppCompatTheme_buttonBarNegativeButtonStyle
               @see #AppCompatTheme_buttonBarNeutralButtonStyle
               @see #AppCompatTheme_buttonBarPositiveButtonStyle
               @see #AppCompatTheme_buttonBarStyle
               @see #AppCompatTheme_buttonStyle
               @see #AppCompatTheme_buttonStyleSmall
               @see #AppCompatTheme_checkboxStyle
               @see #AppCompatTheme_checkedTextViewStyle
               @see #AppCompatTheme_colorAccent
               @see #AppCompatTheme_colorBackgroundFloating
               @see #AppCompatTheme_colorButtonNormal
               @see #AppCompatTheme_colorControlActivated
               @see #AppCompatTheme_colorControlHighlight
               @see #AppCompatTheme_colorControlNormal
               @see #AppCompatTheme_colorError
               @see #AppCompatTheme_colorPrimary
               @see #AppCompatTheme_colorPrimaryDark
               @see #AppCompatTheme_colorSwitchThumbNormal
               @see #AppCompatTheme_controlBackground
               @see #AppCompatTheme_dialogPreferredPadding
               @see #AppCompatTheme_dialogTheme
               @see #AppCompatTheme_dividerHorizontal
               @see #AppCompatTheme_dividerVertical
               @see #AppCompatTheme_dropDownListViewStyle
               @see #AppCompatTheme_dropdownListPreferredItemHeight
               @see #AppCompatTheme_editTextBackground
               @see #AppCompatTheme_editTextColor
               @see #AppCompatTheme_editTextStyle
               @see #AppCompatTheme_homeAsUpIndicator
               @see #AppCompatTheme_imageButtonStyle
               @see #AppCompatTheme_listChoiceBackgroundIndicator
               @see #AppCompatTheme_listDividerAlertDialog
               @see #AppCompatTheme_listMenuViewStyle
               @see #AppCompatTheme_listPopupWindowStyle
               @see #AppCompatTheme_listPreferredItemHeight
               @see #AppCompatTheme_listPreferredItemHeightLarge
               @see #AppCompatTheme_listPreferredItemHeightSmall
               @see #AppCompatTheme_listPreferredItemPaddingLeft
               @see #AppCompatTheme_listPreferredItemPaddingRight
               @see #AppCompatTheme_panelBackground
               @see #AppCompatTheme_panelMenuListTheme
               @see #AppCompatTheme_panelMenuListWidth
               @see #AppCompatTheme_popupMenuStyle
               @see #AppCompatTheme_popupWindowStyle
               @see #AppCompatTheme_radioButtonStyle
               @see #AppCompatTheme_ratingBarStyle
               @see #AppCompatTheme_ratingBarStyleIndicator
               @see #AppCompatTheme_ratingBarStyleSmall
               @see #AppCompatTheme_searchViewStyle
               @see #AppCompatTheme_seekBarStyle
               @see #AppCompatTheme_selectableItemBackground
               @see #AppCompatTheme_selectableItemBackgroundBorderless
               @see #AppCompatTheme_spinnerDropDownItemStyle
               @see #AppCompatTheme_spinnerStyle
               @see #AppCompatTheme_switchStyle
               @see #AppCompatTheme_textAppearanceLargePopupMenu
               @see #AppCompatTheme_textAppearanceListItem
               @see #AppCompatTheme_textAppearanceListItemSecondary
               @see #AppCompatTheme_textAppearanceListItemSmall
               @see #AppCompatTheme_textAppearancePopupMenuHeader
               @see #AppCompatTheme_textAppearanceSearchResultSubtitle
               @see #AppCompatTheme_textAppearanceSearchResultTitle
               @see #AppCompatTheme_textAppearanceSmallPopupMenu
               @see #AppCompatTheme_textColorAlertDialogListItem
               @see #AppCompatTheme_textColorSearchUrl
               @see #AppCompatTheme_toolbarNavigationButtonStyle
               @see #AppCompatTheme_toolbarStyle
               @see #AppCompatTheme_tooltipForegroundColor
               @see #AppCompatTheme_tooltipFrameBackground
               @see #AppCompatTheme_viewInflaterClass
               @see #AppCompatTheme_windowActionBar
               @see #AppCompatTheme_windowActionBarOverlay
               @see #AppCompatTheme_windowActionModeOverlay
               @see #AppCompatTheme_windowFixedHeightMajor
               @see #AppCompatTheme_windowFixedHeightMinor
               @see #AppCompatTheme_windowFixedWidthMajor
               @see #AppCompatTheme_windowFixedWidthMinor
               @see #AppCompatTheme_windowMinWidthMajor
               @see #AppCompatTheme_windowMinWidthMinor
               @see #AppCompatTheme_windowNoTitle
             */
            public static final int[] AppCompatTheme = {
                0x01010057, 0x010100ae, 0x7f010039, 0x7f01003a,
                0x7f01003b, 0x7f01003c, 0x7f01003d, 0x7f01003e,
                0x7f01003f, 0x7f010040, 0x7f010041, 0x7f010042,
                0x7f010043, 0x7f010044, 0x7f010045, 0x7f010046,
                0x7f010047, 0x7f010048, 0x7f010049, 0x7f01004a,
                0x7f01004b, 0x7f01004c, 0x7f01004d, 0x7f01004e,
                0x7f01004f, 0x7f010050, 0x7f010051, 0x7f010052,
                0x7f010053, 0x7f010054, 0x7f010055, 0x7f010056,
                0x7f010057, 0x7f010058, 0x7f010059, 0x7f01005a,
                0x7f01005b, 0x7f01005c, 0x7f01005d, 0x7f01005e,
                0x7f01005f, 0x7f010060, 0x7f010061, 0x7f010062,
                0x7f010063, 0x7f010064, 0x7f010065, 0x7f010066,
                0x7f010067, 0x7f010068, 0x7f010069, 0x7f01006a,
                0x7f01006b, 0x7f01006c, 0x7f01006d, 0x7f01006e,
                0x7f01006f, 0x7f010070, 0x7f010071, 0x7f010072,
                0x7f010073, 0x7f010074, 0x7f010075, 0x7f010076,
                0x7f010077, 0x7f010078, 0x7f010079, 0x7f01007a,
                0x7f01007b, 0x7f01007c, 0x7f01007d, 0x7f01007e,
                0x7f01007f, 0x7f010080, 0x7f010081, 0x7f010082,
                0x7f010083, 0x7f010084, 0x7f010085, 0x7f010086,
                0x7f010087, 0x7f010088, 0x7f010089, 0x7f01008a,
                0x7f01008b, 0x7f01008c, 0x7f01008d, 0x7f01008e,
                0x7f01008f, 0x7f010090, 0x7f010091, 0x7f010092,
                0x7f010093, 0x7f010094, 0x7f010095, 0x7f010096,
                0x7f010097, 0x7f010098, 0x7f010099, 0x7f01009a,
                0x7f01009b, 0x7f01009c, 0x7f01009d, 0x7f01009e,
                0x7f01009f, 0x7f0100a0, 0x7f0100a1, 0x7f0100a2,
                0x7f0100a3, 0x7f0100a4, 0x7f0100a5, 0x7f0100a6,
                0x7f0100a7, 0x7f0100a8, 0x7f0100a9, 0x7f0100aa,
                0x7f0100ab, 0x7f0100ac, 0x7f0100ad, 0x7f0100ae
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarDivider}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarDivider
            */
            public static final int AppCompatTheme_actionBarDivider = 23;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarItemBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarItemBackground
            */
            public static final int AppCompatTheme_actionBarItemBackground = 24;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarPopupTheme}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarPopupTheme
            */
            public static final int AppCompatTheme_actionBarPopupTheme = 17;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarSize}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>wrap_content</code></td><td>0</td><td></td></tr>
    </table>
              @attr name com.sirius:actionBarSize
            */
            public static final int AppCompatTheme_actionBarSize = 22;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarSplitStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarSplitStyle
            */
            public static final int AppCompatTheme_actionBarSplitStyle = 19;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarStyle
            */
            public static final int AppCompatTheme_actionBarStyle = 18;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarTabBarStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarTabBarStyle
            */
            public static final int AppCompatTheme_actionBarTabBarStyle = 13;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarTabStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarTabStyle
            */
            public static final int AppCompatTheme_actionBarTabStyle = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarTabTextStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarTabTextStyle
            */
            public static final int AppCompatTheme_actionBarTabTextStyle = 14;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarTheme}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarTheme
            */
            public static final int AppCompatTheme_actionBarTheme = 20;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionBarWidgetTheme}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionBarWidgetTheme
            */
            public static final int AppCompatTheme_actionBarWidgetTheme = 21;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionButtonStyle
            */
            public static final int AppCompatTheme_actionButtonStyle = 50;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionDropDownStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionDropDownStyle
            */
            public static final int AppCompatTheme_actionDropDownStyle = 46;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionMenuTextAppearance}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionMenuTextAppearance
            */
            public static final int AppCompatTheme_actionMenuTextAppearance = 25;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionMenuTextColor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:actionMenuTextColor
            */
            public static final int AppCompatTheme_actionMenuTextColor = 26;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeBackground
            */
            public static final int AppCompatTheme_actionModeBackground = 29;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeCloseButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeCloseButtonStyle
            */
            public static final int AppCompatTheme_actionModeCloseButtonStyle = 28;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeCloseDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeCloseDrawable
            */
            public static final int AppCompatTheme_actionModeCloseDrawable = 31;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeCopyDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeCopyDrawable
            */
            public static final int AppCompatTheme_actionModeCopyDrawable = 33;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeCutDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeCutDrawable
            */
            public static final int AppCompatTheme_actionModeCutDrawable = 32;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeFindDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeFindDrawable
            */
            public static final int AppCompatTheme_actionModeFindDrawable = 37;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModePasteDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModePasteDrawable
            */
            public static final int AppCompatTheme_actionModePasteDrawable = 34;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModePopupWindowStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModePopupWindowStyle
            */
            public static final int AppCompatTheme_actionModePopupWindowStyle = 39;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeSelectAllDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeSelectAllDrawable
            */
            public static final int AppCompatTheme_actionModeSelectAllDrawable = 35;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeShareDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeShareDrawable
            */
            public static final int AppCompatTheme_actionModeShareDrawable = 36;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeSplitBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeSplitBackground
            */
            public static final int AppCompatTheme_actionModeSplitBackground = 30;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeStyle
            */
            public static final int AppCompatTheme_actionModeStyle = 27;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionModeWebSearchDrawable}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionModeWebSearchDrawable
            */
            public static final int AppCompatTheme_actionModeWebSearchDrawable = 38;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionOverflowButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionOverflowButtonStyle
            */
            public static final int AppCompatTheme_actionOverflowButtonStyle = 15;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionOverflowMenuStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionOverflowMenuStyle
            */
            public static final int AppCompatTheme_actionOverflowMenuStyle = 16;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#activityChooserViewStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:activityChooserViewStyle
            */
            public static final int AppCompatTheme_activityChooserViewStyle = 58;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#alertDialogButtonGroupStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:alertDialogButtonGroupStyle
            */
            public static final int AppCompatTheme_alertDialogButtonGroupStyle = 95;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#alertDialogCenterButtons}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:alertDialogCenterButtons
            */
            public static final int AppCompatTheme_alertDialogCenterButtons = 96;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#alertDialogStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:alertDialogStyle
            */
            public static final int AppCompatTheme_alertDialogStyle = 94;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#alertDialogTheme}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:alertDialogTheme
            */
            public static final int AppCompatTheme_alertDialogTheme = 97;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#windowAnimationStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.
              @attr name android:windowAnimationStyle
            */
            public static final int AppCompatTheme_android_windowAnimationStyle = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#windowIsFloating}
              attribute's value can be found in the {@link #AppCompatTheme} array.
              @attr name android:windowIsFloating
            */
            public static final int AppCompatTheme_android_windowIsFloating = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#autoCompleteTextViewStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:autoCompleteTextViewStyle
            */
            public static final int AppCompatTheme_autoCompleteTextViewStyle = 102;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#borderlessButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:borderlessButtonStyle
            */
            public static final int AppCompatTheme_borderlessButtonStyle = 55;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonBarButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonBarButtonStyle
            */
            public static final int AppCompatTheme_buttonBarButtonStyle = 52;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonBarNegativeButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonBarNegativeButtonStyle
            */
            public static final int AppCompatTheme_buttonBarNegativeButtonStyle = 100;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonBarNeutralButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonBarNeutralButtonStyle
            */
            public static final int AppCompatTheme_buttonBarNeutralButtonStyle = 101;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonBarPositiveButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonBarPositiveButtonStyle
            */
            public static final int AppCompatTheme_buttonBarPositiveButtonStyle = 99;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonBarStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonBarStyle
            */
            public static final int AppCompatTheme_buttonBarStyle = 51;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonStyle
            */
            public static final int AppCompatTheme_buttonStyle = 103;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonStyleSmall}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:buttonStyleSmall
            */
            public static final int AppCompatTheme_buttonStyleSmall = 104;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#checkboxStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:checkboxStyle
            */
            public static final int AppCompatTheme_checkboxStyle = 105;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#checkedTextViewStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:checkedTextViewStyle
            */
            public static final int AppCompatTheme_checkedTextViewStyle = 106;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorAccent}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorAccent
            */
            public static final int AppCompatTheme_colorAccent = 86;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorBackgroundFloating}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorBackgroundFloating
            */
            public static final int AppCompatTheme_colorBackgroundFloating = 93;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorButtonNormal}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorButtonNormal
            */
            public static final int AppCompatTheme_colorButtonNormal = 90;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorControlActivated}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorControlActivated
            */
            public static final int AppCompatTheme_colorControlActivated = 88;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorControlHighlight}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorControlHighlight
            */
            public static final int AppCompatTheme_colorControlHighlight = 89;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorControlNormal}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorControlNormal
            */
            public static final int AppCompatTheme_colorControlNormal = 87;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorError}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:colorError
            */
            public static final int AppCompatTheme_colorError = 118;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorPrimary}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorPrimary
            */
            public static final int AppCompatTheme_colorPrimary = 84;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorPrimaryDark}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorPrimaryDark
            */
            public static final int AppCompatTheme_colorPrimaryDark = 85;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorSwitchThumbNormal}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:colorSwitchThumbNormal
            */
            public static final int AppCompatTheme_colorSwitchThumbNormal = 91;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#controlBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:controlBackground
            */
            public static final int AppCompatTheme_controlBackground = 92;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dialogPreferredPadding}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:dialogPreferredPadding
            */
            public static final int AppCompatTheme_dialogPreferredPadding = 44;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dialogTheme}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:dialogTheme
            */
            public static final int AppCompatTheme_dialogTheme = 43;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dividerHorizontal}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:dividerHorizontal
            */
            public static final int AppCompatTheme_dividerHorizontal = 57;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dividerVertical}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:dividerVertical
            */
            public static final int AppCompatTheme_dividerVertical = 56;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dropDownListViewStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:dropDownListViewStyle
            */
            public static final int AppCompatTheme_dropDownListViewStyle = 75;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dropdownListPreferredItemHeight}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:dropdownListPreferredItemHeight
            */
            public static final int AppCompatTheme_dropdownListPreferredItemHeight = 47;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#editTextBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:editTextBackground
            */
            public static final int AppCompatTheme_editTextBackground = 64;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#editTextColor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:editTextColor
            */
            public static final int AppCompatTheme_editTextColor = 63;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#editTextStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:editTextStyle
            */
            public static final int AppCompatTheme_editTextStyle = 107;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#homeAsUpIndicator}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:homeAsUpIndicator
            */
            public static final int AppCompatTheme_homeAsUpIndicator = 49;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#imageButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:imageButtonStyle
            */
            public static final int AppCompatTheme_imageButtonStyle = 65;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listChoiceBackgroundIndicator}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:listChoiceBackgroundIndicator
            */
            public static final int AppCompatTheme_listChoiceBackgroundIndicator = 83;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listDividerAlertDialog}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:listDividerAlertDialog
            */
            public static final int AppCompatTheme_listDividerAlertDialog = 45;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listMenuViewStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:listMenuViewStyle
            */
            public static final int AppCompatTheme_listMenuViewStyle = 115;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listPopupWindowStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:listPopupWindowStyle
            */
            public static final int AppCompatTheme_listPopupWindowStyle = 76;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listPreferredItemHeight}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:listPreferredItemHeight
            */
            public static final int AppCompatTheme_listPreferredItemHeight = 70;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listPreferredItemHeightLarge}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:listPreferredItemHeightLarge
            */
            public static final int AppCompatTheme_listPreferredItemHeightLarge = 72;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listPreferredItemHeightSmall}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:listPreferredItemHeightSmall
            */
            public static final int AppCompatTheme_listPreferredItemHeightSmall = 71;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listPreferredItemPaddingLeft}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:listPreferredItemPaddingLeft
            */
            public static final int AppCompatTheme_listPreferredItemPaddingLeft = 73;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#listPreferredItemPaddingRight}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:listPreferredItemPaddingRight
            */
            public static final int AppCompatTheme_listPreferredItemPaddingRight = 74;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#panelBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:panelBackground
            */
            public static final int AppCompatTheme_panelBackground = 80;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#panelMenuListTheme}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:panelMenuListTheme
            */
            public static final int AppCompatTheme_panelMenuListTheme = 82;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#panelMenuListWidth}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:panelMenuListWidth
            */
            public static final int AppCompatTheme_panelMenuListWidth = 81;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#popupMenuStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:popupMenuStyle
            */
            public static final int AppCompatTheme_popupMenuStyle = 61;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#popupWindowStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:popupWindowStyle
            */
            public static final int AppCompatTheme_popupWindowStyle = 62;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#radioButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:radioButtonStyle
            */
            public static final int AppCompatTheme_radioButtonStyle = 108;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ratingBarStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:ratingBarStyle
            */
            public static final int AppCompatTheme_ratingBarStyle = 109;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ratingBarStyleIndicator}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:ratingBarStyleIndicator
            */
            public static final int AppCompatTheme_ratingBarStyleIndicator = 110;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ratingBarStyleSmall}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:ratingBarStyleSmall
            */
            public static final int AppCompatTheme_ratingBarStyleSmall = 111;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#searchViewStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:searchViewStyle
            */
            public static final int AppCompatTheme_searchViewStyle = 69;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#seekBarStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:seekBarStyle
            */
            public static final int AppCompatTheme_seekBarStyle = 112;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#selectableItemBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:selectableItemBackground
            */
            public static final int AppCompatTheme_selectableItemBackground = 53;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#selectableItemBackgroundBorderless}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:selectableItemBackgroundBorderless
            */
            public static final int AppCompatTheme_selectableItemBackgroundBorderless = 54;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#spinnerDropDownItemStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:spinnerDropDownItemStyle
            */
            public static final int AppCompatTheme_spinnerDropDownItemStyle = 48;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#spinnerStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:spinnerStyle
            */
            public static final int AppCompatTheme_spinnerStyle = 113;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#switchStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:switchStyle
            */
            public static final int AppCompatTheme_switchStyle = 114;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceLargePopupMenu}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceLargePopupMenu
            */
            public static final int AppCompatTheme_textAppearanceLargePopupMenu = 40;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceListItem}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceListItem
            */
            public static final int AppCompatTheme_textAppearanceListItem = 77;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceListItemSecondary}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceListItemSecondary
            */
            public static final int AppCompatTheme_textAppearanceListItemSecondary = 78;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceListItemSmall}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceListItemSmall
            */
            public static final int AppCompatTheme_textAppearanceListItemSmall = 79;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearancePopupMenuHeader}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearancePopupMenuHeader
            */
            public static final int AppCompatTheme_textAppearancePopupMenuHeader = 42;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceSearchResultSubtitle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceSearchResultSubtitle
            */
            public static final int AppCompatTheme_textAppearanceSearchResultSubtitle = 67;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceSearchResultTitle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceSearchResultTitle
            */
            public static final int AppCompatTheme_textAppearanceSearchResultTitle = 66;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAppearanceSmallPopupMenu}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:textAppearanceSmallPopupMenu
            */
            public static final int AppCompatTheme_textAppearanceSmallPopupMenu = 41;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textColorAlertDialogListItem}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:textColorAlertDialogListItem
            */
            public static final int AppCompatTheme_textColorAlertDialogListItem = 98;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textColorSearchUrl}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:textColorSearchUrl
            */
            public static final int AppCompatTheme_textColorSearchUrl = 68;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#toolbarNavigationButtonStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:toolbarNavigationButtonStyle
            */
            public static final int AppCompatTheme_toolbarNavigationButtonStyle = 60;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#toolbarStyle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:toolbarStyle
            */
            public static final int AppCompatTheme_toolbarStyle = 59;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tooltipForegroundColor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:tooltipForegroundColor
            */
            public static final int AppCompatTheme_tooltipForegroundColor = 117;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tooltipFrameBackground}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:tooltipFrameBackground
            */
            public static final int AppCompatTheme_tooltipFrameBackground = 116;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#viewInflaterClass}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:viewInflaterClass
            */
            public static final int AppCompatTheme_viewInflaterClass = 119;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowActionBar}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowActionBar
            */
            public static final int AppCompatTheme_windowActionBar = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowActionBarOverlay}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowActionBarOverlay
            */
            public static final int AppCompatTheme_windowActionBarOverlay = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowActionModeOverlay}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowActionModeOverlay
            */
            public static final int AppCompatTheme_windowActionModeOverlay = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowFixedHeightMajor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowFixedHeightMajor
            */
            public static final int AppCompatTheme_windowFixedHeightMajor = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowFixedHeightMinor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowFixedHeightMinor
            */
            public static final int AppCompatTheme_windowFixedHeightMinor = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowFixedWidthMajor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowFixedWidthMajor
            */
            public static final int AppCompatTheme_windowFixedWidthMajor = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowFixedWidthMinor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowFixedWidthMinor
            */
            public static final int AppCompatTheme_windowFixedWidthMinor = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowMinWidthMajor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowMinWidthMajor
            */
            public static final int AppCompatTheme_windowMinWidthMajor = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowMinWidthMinor}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>May be a fractional value, which is a floating point number appended with either % or %p, such as "<code>14.5%</code>".
    The % suffix always means a percentage of the base size; the optional %p suffix provides a size relative to
    some parent container.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowMinWidthMinor
            */
            public static final int AppCompatTheme_windowMinWidthMinor = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#windowNoTitle}
              attribute's value can be found in the {@link #AppCompatTheme} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:windowNoTitle
            */
            public static final int AppCompatTheme_windowNoTitle = 3;
            /** Attributes that can be used with a AppDataSearch.
             */
            public static final int[] AppDataSearch = {

            };
            /** Attributes that can be used with a ButtonBarLayout.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ButtonBarLayout_allowStacking com.sirius:allowStacking}</code></td><td></td></tr>
               </table>
               @see #ButtonBarLayout_allowStacking
             */
            public static final int[] ButtonBarLayout = {
                0x7f0100af
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#allowStacking}
              attribute's value can be found in the {@link #ButtonBarLayout} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:allowStacking
            */
            public static final int ButtonBarLayout_allowStacking = 0;
            /** Attributes that can be used with a ColorStateListItem.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ColorStateListItem_alpha com.sirius:alpha}</code></td><td></td></tr>
               <tr><td><code>{@link #ColorStateListItem_android_alpha android:alpha}</code></td><td></td></tr>
               <tr><td><code>{@link #ColorStateListItem_android_color android:color}</code></td><td></td></tr>
               </table>
               @see #ColorStateListItem_alpha
               @see #ColorStateListItem_android_alpha
               @see #ColorStateListItem_android_color
             */
            public static final int[] ColorStateListItem = {
                0x010101a5, 0x0101031f, 0x7f0100b0
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#alpha}
              attribute's value can be found in the {@link #ColorStateListItem} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:alpha
            */
            public static final int ColorStateListItem_alpha = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#alpha}
              attribute's value can be found in the {@link #ColorStateListItem} array.
              @attr name android:alpha
            */
            public static final int ColorStateListItem_android_alpha = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#color}
              attribute's value can be found in the {@link #ColorStateListItem} array.
              @attr name android:color
            */
            public static final int ColorStateListItem_android_color = 0;
            /** Attributes that can be used with a CompoundButton.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #CompoundButton_android_button android:button}</code></td><td></td></tr>
               <tr><td><code>{@link #CompoundButton_buttonTint com.sirius:buttonTint}</code></td><td></td></tr>
               <tr><td><code>{@link #CompoundButton_buttonTintMode com.sirius:buttonTintMode}</code></td><td></td></tr>
               </table>
               @see #CompoundButton_android_button
               @see #CompoundButton_buttonTint
               @see #CompoundButton_buttonTintMode
             */
            public static final int[] CompoundButton = {
                0x01010107, 0x7f0100b1, 0x7f0100b2
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#button}
              attribute's value can be found in the {@link #CompoundButton} array.
              @attr name android:button
            */
            public static final int CompoundButton_android_button = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonTint}
              attribute's value can be found in the {@link #CompoundButton} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:buttonTint
            */
            public static final int CompoundButton_buttonTint = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonTintMode}
              attribute's value can be found in the {@link #CompoundButton} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:buttonTintMode
            */
            public static final int CompoundButton_buttonTintMode = 2;
            /** Attributes that can be used with a CoordinatorLayout.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #CoordinatorLayout_keylines com.sirius:keylines}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_statusBarBackground com.sirius:statusBarBackground}</code></td><td></td></tr>
               </table>
               @see #CoordinatorLayout_keylines
               @see #CoordinatorLayout_statusBarBackground
             */
            public static final int[] CoordinatorLayout = {
                0x7f0100b3, 0x7f0100b4
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#keylines}
              attribute's value can be found in the {@link #CoordinatorLayout} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:keylines
            */
            public static final int CoordinatorLayout_keylines = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#statusBarBackground}
              attribute's value can be found in the {@link #CoordinatorLayout} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
              @attr name com.sirius:statusBarBackground
            */
            public static final int CoordinatorLayout_statusBarBackground = 1;
            /** Attributes that can be used with a CoordinatorLayout_Layout.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_android_layout_gravity android:layout_gravity}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_layout_anchor com.sirius:layout_anchor}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_layout_anchorGravity com.sirius:layout_anchorGravity}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_layout_behavior com.sirius:layout_behavior}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_layout_dodgeInsetEdges com.sirius:layout_dodgeInsetEdges}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_layout_insetEdge com.sirius:layout_insetEdge}</code></td><td></td></tr>
               <tr><td><code>{@link #CoordinatorLayout_Layout_layout_keyline com.sirius:layout_keyline}</code></td><td></td></tr>
               </table>
               @see #CoordinatorLayout_Layout_android_layout_gravity
               @see #CoordinatorLayout_Layout_layout_anchor
               @see #CoordinatorLayout_Layout_layout_anchorGravity
               @see #CoordinatorLayout_Layout_layout_behavior
               @see #CoordinatorLayout_Layout_layout_dodgeInsetEdges
               @see #CoordinatorLayout_Layout_layout_insetEdge
               @see #CoordinatorLayout_Layout_layout_keyline
             */
            public static final int[] CoordinatorLayout_Layout = {
                0x010100b3, 0x7f0100b5, 0x7f0100b6, 0x7f0100b7,
                0x7f0100b8, 0x7f0100b9, 0x7f0100ba
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout_gravity}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.
              @attr name android:layout_gravity
            */
            public static final int CoordinatorLayout_Layout_android_layout_gravity = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout_anchor}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:layout_anchor
            */
            public static final int CoordinatorLayout_Layout_layout_anchor = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout_anchorGravity}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    <tr><td><code>left</code></td><td>0x03</td><td></td></tr>
    <tr><td><code>right</code></td><td>0x05</td><td></td></tr>
    <tr><td><code>center_vertical</code></td><td>0x10</td><td></td></tr>
    <tr><td><code>fill_vertical</code></td><td>0x70</td><td></td></tr>
    <tr><td><code>center_horizontal</code></td><td>0x01</td><td></td></tr>
    <tr><td><code>fill_horizontal</code></td><td>0x07</td><td></td></tr>
    <tr><td><code>center</code></td><td>0x11</td><td></td></tr>
    <tr><td><code>fill</code></td><td>0x77</td><td></td></tr>
    <tr><td><code>clip_vertical</code></td><td>0x80</td><td></td></tr>
    <tr><td><code>clip_horizontal</code></td><td>0x08</td><td></td></tr>
    <tr><td><code>start</code></td><td>0x00800003</td><td></td></tr>
    <tr><td><code>end</code></td><td>0x00800005</td><td></td></tr>
    </table>
              @attr name com.sirius:layout_anchorGravity
            */
            public static final int CoordinatorLayout_Layout_layout_anchorGravity = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout_behavior}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:layout_behavior
            */
            public static final int CoordinatorLayout_Layout_layout_behavior = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout_dodgeInsetEdges}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0x0</td><td></td></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    <tr><td><code>left</code></td><td>0x03</td><td></td></tr>
    <tr><td><code>right</code></td><td>0x05</td><td></td></tr>
    <tr><td><code>start</code></td><td>0x00800003</td><td></td></tr>
    <tr><td><code>end</code></td><td>0x00800005</td><td></td></tr>
    <tr><td><code>all</code></td><td>0x77</td><td></td></tr>
    </table>
              @attr name com.sirius:layout_dodgeInsetEdges
            */
            public static final int CoordinatorLayout_Layout_layout_dodgeInsetEdges = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout_insetEdge}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0x0</td><td></td></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    <tr><td><code>left</code></td><td>0x03</td><td></td></tr>
    <tr><td><code>right</code></td><td>0x05</td><td></td></tr>
    <tr><td><code>start</code></td><td>0x00800003</td><td></td></tr>
    <tr><td><code>end</code></td><td>0x00800005</td><td></td></tr>
    </table>
              @attr name com.sirius:layout_insetEdge
            */
            public static final int CoordinatorLayout_Layout_layout_insetEdge = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout_keyline}
              attribute's value can be found in the {@link #CoordinatorLayout_Layout} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:layout_keyline
            */
            public static final int CoordinatorLayout_Layout_layout_keyline = 3;
            /** Attributes that can be used with a Corpus.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #Corpus_contentProviderUri com.sirius:contentProviderUri}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_corpusId com.sirius:corpusId}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_corpusVersion com.sirius:corpusVersion}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_documentMaxAgeSecs com.sirius:documentMaxAgeSecs}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_perAccountTemplate com.sirius:perAccountTemplate}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_schemaOrgType com.sirius:schemaOrgType}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_semanticallySearchable com.sirius:semanticallySearchable}</code></td><td></td></tr>
               <tr><td><code>{@link #Corpus_trimmable com.sirius:trimmable}</code></td><td></td></tr>
               </table>
               @see #Corpus_contentProviderUri
               @see #Corpus_corpusId
               @see #Corpus_corpusVersion
               @see #Corpus_documentMaxAgeSecs
               @see #Corpus_perAccountTemplate
               @see #Corpus_schemaOrgType
               @see #Corpus_semanticallySearchable
               @see #Corpus_trimmable
             */
            public static final int[] Corpus = {
                0x7f0100bb, 0x7f0100bc, 0x7f0100bd, 0x7f0100be,
                0x7f0100bf, 0x7f0100c0, 0x7f0100c1, 0x7f0100c2
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentProviderUri}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentProviderUri
            */
            public static final int Corpus_contentProviderUri = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#corpusId}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:corpusId
            */
            public static final int Corpus_corpusId = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#corpusVersion}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:corpusVersion
            */
            public static final int Corpus_corpusVersion = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#documentMaxAgeSecs}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:documentMaxAgeSecs
            */
            public static final int Corpus_documentMaxAgeSecs = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#perAccountTemplate}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:perAccountTemplate
            */
            public static final int Corpus_perAccountTemplate = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#schemaOrgType}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:schemaOrgType
            */
            public static final int Corpus_schemaOrgType = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#semanticallySearchable}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:semanticallySearchable
            */
            public static final int Corpus_semanticallySearchable = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#trimmable}
              attribute's value can be found in the {@link #Corpus} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:trimmable
            */
            public static final int Corpus_trimmable = 3;
            /** Attributes that can be used with a DrawerArrowToggle.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #DrawerArrowToggle_arrowHeadLength com.sirius:arrowHeadLength}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_arrowShaftLength com.sirius:arrowShaftLength}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_barLength com.sirius:barLength}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_color com.sirius:color}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_drawableSize com.sirius:drawableSize}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_gapBetweenBars com.sirius:gapBetweenBars}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_spinBars com.sirius:spinBars}</code></td><td></td></tr>
               <tr><td><code>{@link #DrawerArrowToggle_thickness com.sirius:thickness}</code></td><td></td></tr>
               </table>
               @see #DrawerArrowToggle_arrowHeadLength
               @see #DrawerArrowToggle_arrowShaftLength
               @see #DrawerArrowToggle_barLength
               @see #DrawerArrowToggle_color
               @see #DrawerArrowToggle_drawableSize
               @see #DrawerArrowToggle_gapBetweenBars
               @see #DrawerArrowToggle_spinBars
               @see #DrawerArrowToggle_thickness
             */
            public static final int[] DrawerArrowToggle = {
                0x7f0100c3, 0x7f0100c4, 0x7f0100c5, 0x7f0100c6,
                0x7f0100c7, 0x7f0100c8, 0x7f0100c9, 0x7f0100ca
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#arrowHeadLength}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:arrowHeadLength
            */
            public static final int DrawerArrowToggle_arrowHeadLength = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#arrowShaftLength}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:arrowShaftLength
            */
            public static final int DrawerArrowToggle_arrowShaftLength = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#barLength}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:barLength
            */
            public static final int DrawerArrowToggle_barLength = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#color}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:color
            */
            public static final int DrawerArrowToggle_color = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#drawableSize}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:drawableSize
            */
            public static final int DrawerArrowToggle_drawableSize = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#gapBetweenBars}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:gapBetweenBars
            */
            public static final int DrawerArrowToggle_gapBetweenBars = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#spinBars}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:spinBars
            */
            public static final int DrawerArrowToggle_spinBars = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#thickness}
              attribute's value can be found in the {@link #DrawerArrowToggle} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:thickness
            */
            public static final int DrawerArrowToggle_thickness = 7;
            /** Attributes that can be used with a FeatureParam.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #FeatureParam_paramName com.sirius:paramName}</code></td><td></td></tr>
               <tr><td><code>{@link #FeatureParam_paramValue com.sirius:paramValue}</code></td><td></td></tr>
               </table>
               @see #FeatureParam_paramName
               @see #FeatureParam_paramValue
             */
            public static final int[] FeatureParam = {
                0x7f0100cb, 0x7f0100cc
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#paramName}
              attribute's value can be found in the {@link #FeatureParam} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:paramName
            */
            public static final int FeatureParam_paramName = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#paramValue}
              attribute's value can be found in the {@link #FeatureParam} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:paramValue
            */
            public static final int FeatureParam_paramValue = 1;
            /** Attributes that can be used with a FontFamily.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #FontFamily_fontProviderAuthority com.sirius:fontProviderAuthority}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamily_fontProviderCerts com.sirius:fontProviderCerts}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamily_fontProviderFetchStrategy com.sirius:fontProviderFetchStrategy}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamily_fontProviderFetchTimeout com.sirius:fontProviderFetchTimeout}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamily_fontProviderPackage com.sirius:fontProviderPackage}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamily_fontProviderQuery com.sirius:fontProviderQuery}</code></td><td></td></tr>
               </table>
               @see #FontFamily_fontProviderAuthority
               @see #FontFamily_fontProviderCerts
               @see #FontFamily_fontProviderFetchStrategy
               @see #FontFamily_fontProviderFetchTimeout
               @see #FontFamily_fontProviderPackage
               @see #FontFamily_fontProviderQuery
             */
            public static final int[] FontFamily = {
                0x7f0100cd, 0x7f0100ce, 0x7f0100cf, 0x7f0100d0,
                0x7f0100d1, 0x7f0100d2
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontProviderAuthority}
              attribute's value can be found in the {@link #FontFamily} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fontProviderAuthority
            */
            public static final int FontFamily_fontProviderAuthority = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontProviderCerts}
              attribute's value can be found in the {@link #FontFamily} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:fontProviderCerts
            */
            public static final int FontFamily_fontProviderCerts = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontProviderFetchStrategy}
              attribute's value can be found in the {@link #FontFamily} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>blocking</code></td><td>0</td><td></td></tr>
    <tr><td><code>async</code></td><td>1</td><td></td></tr>
    </table>
              @attr name com.sirius:fontProviderFetchStrategy
            */
            public static final int FontFamily_fontProviderFetchStrategy = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontProviderFetchTimeout}
              attribute's value can be found in the {@link #FontFamily} array.


              <p>May be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>forever</code></td><td>-1</td><td></td></tr>
    </table>
              @attr name com.sirius:fontProviderFetchTimeout
            */
            public static final int FontFamily_fontProviderFetchTimeout = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontProviderPackage}
              attribute's value can be found in the {@link #FontFamily} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fontProviderPackage
            */
            public static final int FontFamily_fontProviderPackage = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontProviderQuery}
              attribute's value can be found in the {@link #FontFamily} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fontProviderQuery
            */
            public static final int FontFamily_fontProviderQuery = 2;
            /** Attributes that can be used with a FontFamilyFont.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #FontFamilyFont_android_font android:font}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamilyFont_android_fontStyle android:fontStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamilyFont_android_fontWeight android:fontWeight}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamilyFont_font com.sirius:font}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamilyFont_fontStyle com.sirius:fontStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #FontFamilyFont_fontWeight com.sirius:fontWeight}</code></td><td></td></tr>
               </table>
               @see #FontFamilyFont_android_font
               @see #FontFamilyFont_android_fontStyle
               @see #FontFamilyFont_android_fontWeight
               @see #FontFamilyFont_font
               @see #FontFamilyFont_fontStyle
               @see #FontFamilyFont_fontWeight
             */
            public static final int[] FontFamilyFont = {
                0x01010532, 0x01010533, 0x0101053f, 0x7f0100d3,
                0x7f0100d4, 0x7f0100d5
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#font}
              attribute's value can be found in the {@link #FontFamilyFont} array.
              @attr name android:font
            */
            public static final int FontFamilyFont_android_font = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#fontStyle}
              attribute's value can be found in the {@link #FontFamilyFont} array.
              @attr name android:fontStyle
            */
            public static final int FontFamilyFont_android_fontStyle = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#fontWeight}
              attribute's value can be found in the {@link #FontFamilyFont} array.
              @attr name android:fontWeight
            */
            public static final int FontFamilyFont_android_fontWeight = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#font}
              attribute's value can be found in the {@link #FontFamilyFont} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:font
            */
            public static final int FontFamilyFont_font = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontStyle}
              attribute's value can be found in the {@link #FontFamilyFont} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>normal</code></td><td>0</td><td></td></tr>
    <tr><td><code>italic</code></td><td>1</td><td></td></tr>
    </table>
              @attr name com.sirius:fontStyle
            */
            public static final int FontFamilyFont_fontStyle = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontWeight}
              attribute's value can be found in the {@link #FontFamilyFont} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fontWeight
            */
            public static final int FontFamilyFont_fontWeight = 5;
            /** Attributes that can be used with a GenericDraweeHierarchy.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_actualImageScaleType com.sirius:actualImageScaleType}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_backgroundImage com.sirius:backgroundImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_fadeDuration com.sirius:fadeDuration}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_failureImage com.sirius:failureImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_failureImageScaleType com.sirius:failureImageScaleType}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_overlayImage com.sirius:overlayImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_placeholderImage com.sirius:placeholderImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_placeholderImageScaleType com.sirius:placeholderImageScaleType}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_pressedStateOverlayImage com.sirius:pressedStateOverlayImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_progressBarAutoRotateInterval com.sirius:progressBarAutoRotateInterval}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_progressBarImage com.sirius:progressBarImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_progressBarImageScaleType com.sirius:progressBarImageScaleType}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_retryImage com.sirius:retryImage}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_retryImageScaleType com.sirius:retryImageScaleType}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundAsCircle com.sirius:roundAsCircle}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundBottomLeft com.sirius:roundBottomLeft}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundBottomRight com.sirius:roundBottomRight}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundTopLeft com.sirius:roundTopLeft}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundTopRight com.sirius:roundTopRight}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundWithOverlayColor com.sirius:roundWithOverlayColor}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundedCornerRadius com.sirius:roundedCornerRadius}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundingBorderColor com.sirius:roundingBorderColor}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundingBorderPadding com.sirius:roundingBorderPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_roundingBorderWidth com.sirius:roundingBorderWidth}</code></td><td></td></tr>
               <tr><td><code>{@link #GenericDraweeHierarchy_viewAspectRatio com.sirius:viewAspectRatio}</code></td><td></td></tr>
               </table>
               @see #GenericDraweeHierarchy_actualImageScaleType
               @see #GenericDraweeHierarchy_backgroundImage
               @see #GenericDraweeHierarchy_fadeDuration
               @see #GenericDraweeHierarchy_failureImage
               @see #GenericDraweeHierarchy_failureImageScaleType
               @see #GenericDraweeHierarchy_overlayImage
               @see #GenericDraweeHierarchy_placeholderImage
               @see #GenericDraweeHierarchy_placeholderImageScaleType
               @see #GenericDraweeHierarchy_pressedStateOverlayImage
               @see #GenericDraweeHierarchy_progressBarAutoRotateInterval
               @see #GenericDraweeHierarchy_progressBarImage
               @see #GenericDraweeHierarchy_progressBarImageScaleType
               @see #GenericDraweeHierarchy_retryImage
               @see #GenericDraweeHierarchy_retryImageScaleType
               @see #GenericDraweeHierarchy_roundAsCircle
               @see #GenericDraweeHierarchy_roundBottomLeft
               @see #GenericDraweeHierarchy_roundBottomRight
               @see #GenericDraweeHierarchy_roundTopLeft
               @see #GenericDraweeHierarchy_roundTopRight
               @see #GenericDraweeHierarchy_roundWithOverlayColor
               @see #GenericDraweeHierarchy_roundedCornerRadius
               @see #GenericDraweeHierarchy_roundingBorderColor
               @see #GenericDraweeHierarchy_roundingBorderPadding
               @see #GenericDraweeHierarchy_roundingBorderWidth
               @see #GenericDraweeHierarchy_viewAspectRatio
             */
            public static final int[] GenericDraweeHierarchy = {
                0x7f0100d6, 0x7f0100d7, 0x7f0100d8, 0x7f0100d9,
                0x7f0100da, 0x7f0100db, 0x7f0100dc, 0x7f0100dd,
                0x7f0100de, 0x7f0100df, 0x7f0100e0, 0x7f0100e1,
                0x7f0100e2, 0x7f0100e3, 0x7f0100e4, 0x7f0100e5,
                0x7f0100e6, 0x7f0100e7, 0x7f0100e8, 0x7f0100e9,
                0x7f0100ea, 0x7f0100eb, 0x7f0100ec, 0x7f0100ed,
                0x7f0100ee
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actualImageScaleType}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
              @attr name com.sirius:actualImageScaleType
            */
            public static final int GenericDraweeHierarchy_actualImageScaleType = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#backgroundImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:backgroundImage
            */
            public static final int GenericDraweeHierarchy_backgroundImage = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fadeDuration}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fadeDuration
            */
            public static final int GenericDraweeHierarchy_fadeDuration = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#failureImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:failureImage
            */
            public static final int GenericDraweeHierarchy_failureImage = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#failureImageScaleType}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
              @attr name com.sirius:failureImageScaleType
            */
            public static final int GenericDraweeHierarchy_failureImageScaleType = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#overlayImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:overlayImage
            */
            public static final int GenericDraweeHierarchy_overlayImage = 13;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#placeholderImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:placeholderImage
            */
            public static final int GenericDraweeHierarchy_placeholderImage = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#placeholderImageScaleType}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
              @attr name com.sirius:placeholderImageScaleType
            */
            public static final int GenericDraweeHierarchy_placeholderImageScaleType = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#pressedStateOverlayImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:pressedStateOverlayImage
            */
            public static final int GenericDraweeHierarchy_pressedStateOverlayImage = 14;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#progressBarAutoRotateInterval}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:progressBarAutoRotateInterval
            */
            public static final int GenericDraweeHierarchy_progressBarAutoRotateInterval = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#progressBarImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:progressBarImage
            */
            public static final int GenericDraweeHierarchy_progressBarImage = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#progressBarImageScaleType}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
              @attr name com.sirius:progressBarImageScaleType
            */
            public static final int GenericDraweeHierarchy_progressBarImageScaleType = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#retryImage}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:retryImage
            */
            public static final int GenericDraweeHierarchy_retryImage = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#retryImageScaleType}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>-1</td><td></td></tr>
    <tr><td><code>fitXY</code></td><td>0</td><td></td></tr>
    <tr><td><code>fitStart</code></td><td>1</td><td></td></tr>
    <tr><td><code>fitCenter</code></td><td>2</td><td></td></tr>
    <tr><td><code>fitEnd</code></td><td>3</td><td></td></tr>
    <tr><td><code>center</code></td><td>4</td><td></td></tr>
    <tr><td><code>centerInside</code></td><td>5</td><td></td></tr>
    <tr><td><code>centerCrop</code></td><td>6</td><td></td></tr>
    <tr><td><code>focusCrop</code></td><td>7</td><td></td></tr>
    </table>
              @attr name com.sirius:retryImageScaleType
            */
            public static final int GenericDraweeHierarchy_retryImageScaleType = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundAsCircle}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundAsCircle
            */
            public static final int GenericDraweeHierarchy_roundAsCircle = 15;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundBottomLeft}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundBottomLeft
            */
            public static final int GenericDraweeHierarchy_roundBottomLeft = 20;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundBottomRight}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundBottomRight
            */
            public static final int GenericDraweeHierarchy_roundBottomRight = 19;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundTopLeft}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundTopLeft
            */
            public static final int GenericDraweeHierarchy_roundTopLeft = 17;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundTopRight}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundTopRight
            */
            public static final int GenericDraweeHierarchy_roundTopRight = 18;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundWithOverlayColor}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundWithOverlayColor
            */
            public static final int GenericDraweeHierarchy_roundWithOverlayColor = 21;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundedCornerRadius}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundedCornerRadius
            */
            public static final int GenericDraweeHierarchy_roundedCornerRadius = 16;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundingBorderColor}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundingBorderColor
            */
            public static final int GenericDraweeHierarchy_roundingBorderColor = 23;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundingBorderPadding}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundingBorderPadding
            */
            public static final int GenericDraweeHierarchy_roundingBorderPadding = 24;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#roundingBorderWidth}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:roundingBorderWidth
            */
            public static final int GenericDraweeHierarchy_roundingBorderWidth = 22;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#viewAspectRatio}
              attribute's value can be found in the {@link #GenericDraweeHierarchy} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:viewAspectRatio
            */
            public static final int GenericDraweeHierarchy_viewAspectRatio = 1;
            /** Attributes that can be used with a GlobalSearch.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #GlobalSearch_defaultIntentAction com.sirius:defaultIntentAction}</code></td><td></td></tr>
               <tr><td><code>{@link #GlobalSearch_defaultIntentActivity com.sirius:defaultIntentActivity}</code></td><td></td></tr>
               <tr><td><code>{@link #GlobalSearch_defaultIntentData com.sirius:defaultIntentData}</code></td><td></td></tr>
               <tr><td><code>{@link #GlobalSearch_searchEnabled com.sirius:searchEnabled}</code></td><td></td></tr>
               <tr><td><code>{@link #GlobalSearch_searchLabel com.sirius:searchLabel}</code></td><td></td></tr>
               <tr><td><code>{@link #GlobalSearch_settingsDescription com.sirius:settingsDescription}</code></td><td></td></tr>
               </table>
               @see #GlobalSearch_defaultIntentAction
               @see #GlobalSearch_defaultIntentActivity
               @see #GlobalSearch_defaultIntentData
               @see #GlobalSearch_searchEnabled
               @see #GlobalSearch_searchLabel
               @see #GlobalSearch_settingsDescription
             */
            public static final int[] GlobalSearch = {
                0x7f0100ef, 0x7f0100f0, 0x7f0100f1, 0x7f0100f2,
                0x7f0100f3, 0x7f0100f4
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#defaultIntentAction}
              attribute's value can be found in the {@link #GlobalSearch} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:defaultIntentAction
            */
            public static final int GlobalSearch_defaultIntentAction = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#defaultIntentActivity}
              attribute's value can be found in the {@link #GlobalSearch} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:defaultIntentActivity
            */
            public static final int GlobalSearch_defaultIntentActivity = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#defaultIntentData}
              attribute's value can be found in the {@link #GlobalSearch} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:defaultIntentData
            */
            public static final int GlobalSearch_defaultIntentData = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#searchEnabled}
              attribute's value can be found in the {@link #GlobalSearch} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:searchEnabled
            */
            public static final int GlobalSearch_searchEnabled = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#searchLabel}
              attribute's value can be found in the {@link #GlobalSearch} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:searchLabel
            */
            public static final int GlobalSearch_searchLabel = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#settingsDescription}
              attribute's value can be found in the {@link #GlobalSearch} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:settingsDescription
            */
            public static final int GlobalSearch_settingsDescription = 2;
            /** Attributes that can be used with a GlobalSearchCorpus.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #GlobalSearchCorpus_allowShortcuts com.sirius:allowShortcuts}</code></td><td></td></tr>
               </table>
               @see #GlobalSearchCorpus_allowShortcuts
             */
            public static final int[] GlobalSearchCorpus = {
                0x7f0100f5
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#allowShortcuts}
              attribute's value can be found in the {@link #GlobalSearchCorpus} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:allowShortcuts
            */
            public static final int GlobalSearchCorpus_allowShortcuts = 0;
            /** Attributes that can be used with a GlobalSearchSection.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #GlobalSearchSection_sectionContent com.sirius:sectionContent}</code></td><td></td></tr>
               <tr><td><code>{@link #GlobalSearchSection_sectionType com.sirius:sectionType}</code></td><td></td></tr>
               </table>
               @see #GlobalSearchSection_sectionContent
               @see #GlobalSearchSection_sectionType
             */
            public static final int[] GlobalSearchSection = {
                0x7f0100f6, 0x7f0100f7
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#sectionContent}
              attribute's value can be found in the {@link #GlobalSearchSection} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:sectionContent
            */
            public static final int GlobalSearchSection_sectionContent = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#sectionType}
              attribute's value can be found in the {@link #GlobalSearchSection} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>text1</code></td><td>0</td><td></td></tr>
    <tr><td><code>text2</code></td><td>1</td><td></td></tr>
    <tr><td><code>icon_uri</code></td><td>2</td><td></td></tr>
    <tr><td><code>intent_action</code></td><td>3</td><td></td></tr>
    <tr><td><code>intent_data</code></td><td>4</td><td></td></tr>
    <tr><td><code>intent_data_id</code></td><td>5</td><td></td></tr>
    <tr><td><code>intent_extra_data</code></td><td>6</td><td></td></tr>
    <tr><td><code>large_icon_uri</code></td><td>7</td><td></td></tr>
    <tr><td><code>intent_activity</code></td><td>8</td><td></td></tr>
    <tr><td><code>thing_proto</code></td><td>9</td><td></td></tr>
    </table>
              @attr name com.sirius:sectionType
            */
            public static final int GlobalSearchSection_sectionType = 0;
            /** Attributes that can be used with a IMECorpus.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #IMECorpus_inputEnabled com.sirius:inputEnabled}</code></td><td></td></tr>
               <tr><td><code>{@link #IMECorpus_sourceClass com.sirius:sourceClass}</code></td><td></td></tr>
               <tr><td><code>{@link #IMECorpus_toAddressesSection com.sirius:toAddressesSection}</code></td><td></td></tr>
               <tr><td><code>{@link #IMECorpus_userInputSection com.sirius:userInputSection}</code></td><td></td></tr>
               <tr><td><code>{@link #IMECorpus_userInputTag com.sirius:userInputTag}</code></td><td></td></tr>
               <tr><td><code>{@link #IMECorpus_userInputValue com.sirius:userInputValue}</code></td><td></td></tr>
               </table>
               @see #IMECorpus_inputEnabled
               @see #IMECorpus_sourceClass
               @see #IMECorpus_toAddressesSection
               @see #IMECorpus_userInputSection
               @see #IMECorpus_userInputTag
               @see #IMECorpus_userInputValue
             */
            public static final int[] IMECorpus = {
                0x7f0100f8, 0x7f0100f9, 0x7f0100fa, 0x7f0100fb,
                0x7f0100fc, 0x7f0100fd
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#inputEnabled}
              attribute's value can be found in the {@link #IMECorpus} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:inputEnabled
            */
            public static final int IMECorpus_inputEnabled = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#sourceClass}
              attribute's value can be found in the {@link #IMECorpus} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>email</code></td><td>0</td><td></td></tr>
    <tr><td><code>contact</code></td><td>1</td><td></td></tr>
    <tr><td><code>instant_message</code></td><td>2</td><td></td></tr>
    </table>
              @attr name com.sirius:sourceClass
            */
            public static final int IMECorpus_sourceClass = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#toAddressesSection}
              attribute's value can be found in the {@link #IMECorpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:toAddressesSection
            */
            public static final int IMECorpus_toAddressesSection = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#userInputSection}
              attribute's value can be found in the {@link #IMECorpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:userInputSection
            */
            public static final int IMECorpus_userInputSection = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#userInputTag}
              attribute's value can be found in the {@link #IMECorpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:userInputTag
            */
            public static final int IMECorpus_userInputTag = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#userInputValue}
              attribute's value can be found in the {@link #IMECorpus} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:userInputValue
            */
            public static final int IMECorpus_userInputValue = 4;
            /** Attributes that can be used with a LinearLayoutCompat.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #LinearLayoutCompat_android_baselineAligned android:baselineAligned}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_android_baselineAlignedChildIndex android:baselineAlignedChildIndex}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_android_gravity android:gravity}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_android_orientation android:orientation}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_android_weightSum android:weightSum}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_divider com.sirius:divider}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_dividerPadding com.sirius:dividerPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_measureWithLargestChild com.sirius:measureWithLargestChild}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_showDividers com.sirius:showDividers}</code></td><td></td></tr>
               </table>
               @see #LinearLayoutCompat_android_baselineAligned
               @see #LinearLayoutCompat_android_baselineAlignedChildIndex
               @see #LinearLayoutCompat_android_gravity
               @see #LinearLayoutCompat_android_orientation
               @see #LinearLayoutCompat_android_weightSum
               @see #LinearLayoutCompat_divider
               @see #LinearLayoutCompat_dividerPadding
               @see #LinearLayoutCompat_measureWithLargestChild
               @see #LinearLayoutCompat_showDividers
             */
            public static final int[] LinearLayoutCompat = {
                0x010100af, 0x010100c4, 0x01010126, 0x01010127,
                0x01010128, 0x7f01000c, 0x7f0100fe, 0x7f0100ff,
                0x7f010100
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#baselineAligned}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.
              @attr name android:baselineAligned
            */
            public static final int LinearLayoutCompat_android_baselineAligned = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#baselineAlignedChildIndex}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.
              @attr name android:baselineAlignedChildIndex
            */
            public static final int LinearLayoutCompat_android_baselineAlignedChildIndex = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#gravity}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.
              @attr name android:gravity
            */
            public static final int LinearLayoutCompat_android_gravity = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#orientation}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.
              @attr name android:orientation
            */
            public static final int LinearLayoutCompat_android_orientation = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#weightSum}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.
              @attr name android:weightSum
            */
            public static final int LinearLayoutCompat_android_weightSum = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#divider}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:divider
            */
            public static final int LinearLayoutCompat_divider = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#dividerPadding}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:dividerPadding
            */
            public static final int LinearLayoutCompat_dividerPadding = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#measureWithLargestChild}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:measureWithLargestChild
            */
            public static final int LinearLayoutCompat_measureWithLargestChild = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#showDividers}
              attribute's value can be found in the {@link #LinearLayoutCompat} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>beginning</code></td><td>1</td><td></td></tr>
    <tr><td><code>middle</code></td><td>2</td><td></td></tr>
    <tr><td><code>end</code></td><td>4</td><td></td></tr>
    </table>
              @attr name com.sirius:showDividers
            */
            public static final int LinearLayoutCompat_showDividers = 7;
            /** Attributes that can be used with a LinearLayoutCompat_Layout.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_gravity android:layout_gravity}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_height android:layout_height}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_weight android:layout_weight}</code></td><td></td></tr>
               <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_width android:layout_width}</code></td><td></td></tr>
               </table>
               @see #LinearLayoutCompat_Layout_android_layout_gravity
               @see #LinearLayoutCompat_Layout_android_layout_height
               @see #LinearLayoutCompat_Layout_android_layout_weight
               @see #LinearLayoutCompat_Layout_android_layout_width
             */
            public static final int[] LinearLayoutCompat_Layout = {
                0x010100b3, 0x010100f4, 0x010100f5, 0x01010181
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout_gravity}
              attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
              @attr name android:layout_gravity
            */
            public static final int LinearLayoutCompat_Layout_android_layout_gravity = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout_height}
              attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
              @attr name android:layout_height
            */
            public static final int LinearLayoutCompat_Layout_android_layout_height = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout_weight}
              attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
              @attr name android:layout_weight
            */
            public static final int LinearLayoutCompat_Layout_android_layout_weight = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout_width}
              attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
              @attr name android:layout_width
            */
            public static final int LinearLayoutCompat_Layout_android_layout_width = 1;
            /** Attributes that can be used with a ListPopupWindow.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ListPopupWindow_android_dropDownHorizontalOffset android:dropDownHorizontalOffset}</code></td><td></td></tr>
               <tr><td><code>{@link #ListPopupWindow_android_dropDownVerticalOffset android:dropDownVerticalOffset}</code></td><td></td></tr>
               </table>
               @see #ListPopupWindow_android_dropDownHorizontalOffset
               @see #ListPopupWindow_android_dropDownVerticalOffset
             */
            public static final int[] ListPopupWindow = {
                0x010102ac, 0x010102ad
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#dropDownHorizontalOffset}
              attribute's value can be found in the {@link #ListPopupWindow} array.
              @attr name android:dropDownHorizontalOffset
            */
            public static final int ListPopupWindow_android_dropDownHorizontalOffset = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#dropDownVerticalOffset}
              attribute's value can be found in the {@link #ListPopupWindow} array.
              @attr name android:dropDownVerticalOffset
            */
            public static final int ListPopupWindow_android_dropDownVerticalOffset = 1;
            /** Attributes that can be used with a LoadingImageView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #LoadingImageView_circleCrop com.sirius:circleCrop}</code></td><td></td></tr>
               <tr><td><code>{@link #LoadingImageView_imageAspectRatio com.sirius:imageAspectRatio}</code></td><td></td></tr>
               <tr><td><code>{@link #LoadingImageView_imageAspectRatioAdjust com.sirius:imageAspectRatioAdjust}</code></td><td></td></tr>
               </table>
               @see #LoadingImageView_circleCrop
               @see #LoadingImageView_imageAspectRatio
               @see #LoadingImageView_imageAspectRatioAdjust
             */
            public static final int[] LoadingImageView = {
                0x7f010101, 0x7f010102, 0x7f010103
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#circleCrop}
              attribute's value can be found in the {@link #LoadingImageView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:circleCrop
            */
            public static final int LoadingImageView_circleCrop = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#imageAspectRatio}
              attribute's value can be found in the {@link #LoadingImageView} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:imageAspectRatio
            */
            public static final int LoadingImageView_imageAspectRatio = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#imageAspectRatioAdjust}
              attribute's value can be found in the {@link #LoadingImageView} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>none</code></td><td>0</td><td></td></tr>
    <tr><td><code>adjust_width</code></td><td>1</td><td></td></tr>
    <tr><td><code>adjust_height</code></td><td>2</td><td></td></tr>
    </table>
              @attr name com.sirius:imageAspectRatioAdjust
            */
            public static final int LoadingImageView_imageAspectRatioAdjust = 0;
            /** Attributes that can be used with a MenuGroup.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #MenuGroup_android_checkableBehavior android:checkableBehavior}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuGroup_android_enabled android:enabled}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuGroup_android_id android:id}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuGroup_android_menuCategory android:menuCategory}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuGroup_android_orderInCategory android:orderInCategory}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuGroup_android_visible android:visible}</code></td><td></td></tr>
               </table>
               @see #MenuGroup_android_checkableBehavior
               @see #MenuGroup_android_enabled
               @see #MenuGroup_android_id
               @see #MenuGroup_android_menuCategory
               @see #MenuGroup_android_orderInCategory
               @see #MenuGroup_android_visible
             */
            public static final int[] MenuGroup = {
                0x0101000e, 0x010100d0, 0x01010194, 0x010101de,
                0x010101df, 0x010101e0
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#checkableBehavior}
              attribute's value can be found in the {@link #MenuGroup} array.
              @attr name android:checkableBehavior
            */
            public static final int MenuGroup_android_checkableBehavior = 5;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#enabled}
              attribute's value can be found in the {@link #MenuGroup} array.
              @attr name android:enabled
            */
            public static final int MenuGroup_android_enabled = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#id}
              attribute's value can be found in the {@link #MenuGroup} array.
              @attr name android:id
            */
            public static final int MenuGroup_android_id = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#menuCategory}
              attribute's value can be found in the {@link #MenuGroup} array.
              @attr name android:menuCategory
            */
            public static final int MenuGroup_android_menuCategory = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#orderInCategory}
              attribute's value can be found in the {@link #MenuGroup} array.
              @attr name android:orderInCategory
            */
            public static final int MenuGroup_android_orderInCategory = 4;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#visible}
              attribute's value can be found in the {@link #MenuGroup} array.
              @attr name android:visible
            */
            public static final int MenuGroup_android_visible = 2;
            /** Attributes that can be used with a MenuItem.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #MenuItem_actionLayout com.sirius:actionLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_actionProviderClass com.sirius:actionProviderClass}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_actionViewClass com.sirius:actionViewClass}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_alphabeticModifiers com.sirius:alphabeticModifiers}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_alphabeticShortcut android:alphabeticShortcut}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_checkable android:checkable}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_checked android:checked}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_enabled android:enabled}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_icon android:icon}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_id android:id}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_menuCategory android:menuCategory}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_numericShortcut android:numericShortcut}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_onClick android:onClick}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_orderInCategory android:orderInCategory}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_title android:title}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_titleCondensed android:titleCondensed}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_android_visible android:visible}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_contentDescription com.sirius:contentDescription}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_iconTint com.sirius:iconTint}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_iconTintMode com.sirius:iconTintMode}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_numericModifiers com.sirius:numericModifiers}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_showAsAction com.sirius:showAsAction}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuItem_tooltipText com.sirius:tooltipText}</code></td><td></td></tr>
               </table>
               @see #MenuItem_actionLayout
               @see #MenuItem_actionProviderClass
               @see #MenuItem_actionViewClass
               @see #MenuItem_alphabeticModifiers
               @see #MenuItem_android_alphabeticShortcut
               @see #MenuItem_android_checkable
               @see #MenuItem_android_checked
               @see #MenuItem_android_enabled
               @see #MenuItem_android_icon
               @see #MenuItem_android_id
               @see #MenuItem_android_menuCategory
               @see #MenuItem_android_numericShortcut
               @see #MenuItem_android_onClick
               @see #MenuItem_android_orderInCategory
               @see #MenuItem_android_title
               @see #MenuItem_android_titleCondensed
               @see #MenuItem_android_visible
               @see #MenuItem_contentDescription
               @see #MenuItem_iconTint
               @see #MenuItem_iconTintMode
               @see #MenuItem_numericModifiers
               @see #MenuItem_showAsAction
               @see #MenuItem_tooltipText
             */
            public static final int[] MenuItem = {
                0x01010002, 0x0101000e, 0x010100d0, 0x01010106,
                0x01010194, 0x010101de, 0x010101df, 0x010101e1,
                0x010101e2, 0x010101e3, 0x010101e4, 0x010101e5,
                0x0101026f, 0x7f010104, 0x7f010105, 0x7f010106,
                0x7f010107, 0x7f010108, 0x7f010109, 0x7f01010a,
                0x7f01010b, 0x7f01010c, 0x7f01010d
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionLayout}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actionLayout
            */
            public static final int MenuItem_actionLayout = 16;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionProviderClass}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:actionProviderClass
            */
            public static final int MenuItem_actionProviderClass = 18;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actionViewClass}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:actionViewClass
            */
            public static final int MenuItem_actionViewClass = 17;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#alphabeticModifiers}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>META</code></td><td>0x10000</td><td></td></tr>
    <tr><td><code>CTRL</code></td><td>0x1000</td><td></td></tr>
    <tr><td><code>ALT</code></td><td>0x02</td><td></td></tr>
    <tr><td><code>SHIFT</code></td><td>0x1</td><td></td></tr>
    <tr><td><code>SYM</code></td><td>0x4</td><td></td></tr>
    <tr><td><code>FUNCTION</code></td><td>0x8</td><td></td></tr>
    </table>
              @attr name com.sirius:alphabeticModifiers
            */
            public static final int MenuItem_alphabeticModifiers = 13;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#alphabeticShortcut}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:alphabeticShortcut
            */
            public static final int MenuItem_android_alphabeticShortcut = 9;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#checkable}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:checkable
            */
            public static final int MenuItem_android_checkable = 11;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#checked}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:checked
            */
            public static final int MenuItem_android_checked = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#enabled}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:enabled
            */
            public static final int MenuItem_android_enabled = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#icon}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:icon
            */
            public static final int MenuItem_android_icon = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#id}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:id
            */
            public static final int MenuItem_android_id = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#menuCategory}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:menuCategory
            */
            public static final int MenuItem_android_menuCategory = 5;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#numericShortcut}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:numericShortcut
            */
            public static final int MenuItem_android_numericShortcut = 10;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#onClick}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:onClick
            */
            public static final int MenuItem_android_onClick = 12;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#orderInCategory}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:orderInCategory
            */
            public static final int MenuItem_android_orderInCategory = 6;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#title}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:title
            */
            public static final int MenuItem_android_title = 7;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#titleCondensed}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:titleCondensed
            */
            public static final int MenuItem_android_titleCondensed = 8;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#visible}
              attribute's value can be found in the {@link #MenuItem} array.
              @attr name android:visible
            */
            public static final int MenuItem_android_visible = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentDescription}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentDescription
            */
            public static final int MenuItem_contentDescription = 19;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#iconTint}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:iconTint
            */
            public static final int MenuItem_iconTint = 21;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#iconTintMode}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:iconTintMode
            */
            public static final int MenuItem_iconTintMode = 22;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#numericModifiers}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>META</code></td><td>0x10000</td><td></td></tr>
    <tr><td><code>CTRL</code></td><td>0x1000</td><td></td></tr>
    <tr><td><code>ALT</code></td><td>0x02</td><td></td></tr>
    <tr><td><code>SHIFT</code></td><td>0x1</td><td></td></tr>
    <tr><td><code>SYM</code></td><td>0x4</td><td></td></tr>
    <tr><td><code>FUNCTION</code></td><td>0x8</td><td></td></tr>
    </table>
              @attr name com.sirius:numericModifiers
            */
            public static final int MenuItem_numericModifiers = 14;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#showAsAction}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>never</code></td><td>0</td><td></td></tr>
    <tr><td><code>ifRoom</code></td><td>1</td><td></td></tr>
    <tr><td><code>always</code></td><td>2</td><td></td></tr>
    <tr><td><code>withText</code></td><td>4</td><td></td></tr>
    <tr><td><code>collapseActionView</code></td><td>8</td><td></td></tr>
    </table>
              @attr name com.sirius:showAsAction
            */
            public static final int MenuItem_showAsAction = 15;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#tooltipText}
              attribute's value can be found in the {@link #MenuItem} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:tooltipText
            */
            public static final int MenuItem_tooltipText = 20;
            /** Attributes that can be used with a MenuView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #MenuView_android_headerBackground android:headerBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_android_horizontalDivider android:horizontalDivider}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_android_itemBackground android:itemBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_android_itemIconDisabledAlpha android:itemIconDisabledAlpha}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_android_itemTextAppearance android:itemTextAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_android_verticalDivider android:verticalDivider}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_android_windowAnimationStyle android:windowAnimationStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_preserveIconSpacing com.sirius:preserveIconSpacing}</code></td><td></td></tr>
               <tr><td><code>{@link #MenuView_subMenuArrow com.sirius:subMenuArrow}</code></td><td></td></tr>
               </table>
               @see #MenuView_android_headerBackground
               @see #MenuView_android_horizontalDivider
               @see #MenuView_android_itemBackground
               @see #MenuView_android_itemIconDisabledAlpha
               @see #MenuView_android_itemTextAppearance
               @see #MenuView_android_verticalDivider
               @see #MenuView_android_windowAnimationStyle
               @see #MenuView_preserveIconSpacing
               @see #MenuView_subMenuArrow
             */
            public static final int[] MenuView = {
                0x010100ae, 0x0101012c, 0x0101012d, 0x0101012e,
                0x0101012f, 0x01010130, 0x01010131, 0x7f01010e,
                0x7f01010f
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#headerBackground}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:headerBackground
            */
            public static final int MenuView_android_headerBackground = 4;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#horizontalDivider}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:horizontalDivider
            */
            public static final int MenuView_android_horizontalDivider = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#itemBackground}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:itemBackground
            */
            public static final int MenuView_android_itemBackground = 5;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#itemIconDisabledAlpha}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:itemIconDisabledAlpha
            */
            public static final int MenuView_android_itemIconDisabledAlpha = 6;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#itemTextAppearance}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:itemTextAppearance
            */
            public static final int MenuView_android_itemTextAppearance = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#verticalDivider}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:verticalDivider
            */
            public static final int MenuView_android_verticalDivider = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#windowAnimationStyle}
              attribute's value can be found in the {@link #MenuView} array.
              @attr name android:windowAnimationStyle
            */
            public static final int MenuView_android_windowAnimationStyle = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#preserveIconSpacing}
              attribute's value can be found in the {@link #MenuView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:preserveIconSpacing
            */
            public static final int MenuView_preserveIconSpacing = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subMenuArrow}
              attribute's value can be found in the {@link #MenuView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:subMenuArrow
            */
            public static final int MenuView_subMenuArrow = 8;
            /** Attributes that can be used with a PopupWindow.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #PopupWindow_android_popupAnimationStyle android:popupAnimationStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #PopupWindow_android_popupBackground android:popupBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #PopupWindow_overlapAnchor com.sirius:overlapAnchor}</code></td><td></td></tr>
               </table>
               @see #PopupWindow_android_popupAnimationStyle
               @see #PopupWindow_android_popupBackground
               @see #PopupWindow_overlapAnchor
             */
            public static final int[] PopupWindow = {
                0x01010176, 0x010102c9, 0x7f010110
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#popupAnimationStyle}
              attribute's value can be found in the {@link #PopupWindow} array.
              @attr name android:popupAnimationStyle
            */
            public static final int PopupWindow_android_popupAnimationStyle = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#popupBackground}
              attribute's value can be found in the {@link #PopupWindow} array.
              @attr name android:popupBackground
            */
            public static final int PopupWindow_android_popupBackground = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#overlapAnchor}
              attribute's value can be found in the {@link #PopupWindow} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:overlapAnchor
            */
            public static final int PopupWindow_overlapAnchor = 2;
            /** Attributes that can be used with a PopupWindowBackgroundState.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #PopupWindowBackgroundState_state_above_anchor com.sirius:state_above_anchor}</code></td><td></td></tr>
               </table>
               @see #PopupWindowBackgroundState_state_above_anchor
             */
            public static final int[] PopupWindowBackgroundState = {
                0x7f010111
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#state_above_anchor}
              attribute's value can be found in the {@link #PopupWindowBackgroundState} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:state_above_anchor
            */
            public static final int PopupWindowBackgroundState_state_above_anchor = 0;
            /** Attributes that can be used with a RecycleListView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #RecycleListView_paddingBottomNoButtons com.sirius:paddingBottomNoButtons}</code></td><td></td></tr>
               <tr><td><code>{@link #RecycleListView_paddingTopNoTitle com.sirius:paddingTopNoTitle}</code></td><td></td></tr>
               </table>
               @see #RecycleListView_paddingBottomNoButtons
               @see #RecycleListView_paddingTopNoTitle
             */
            public static final int[] RecycleListView = {
                0x7f010112, 0x7f010113
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#paddingBottomNoButtons}
              attribute's value can be found in the {@link #RecycleListView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:paddingBottomNoButtons
            */
            public static final int RecycleListView_paddingBottomNoButtons = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#paddingTopNoTitle}
              attribute's value can be found in the {@link #RecycleListView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:paddingTopNoTitle
            */
            public static final int RecycleListView_paddingTopNoTitle = 1;
            /** Attributes that can be used with a SearchView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #SearchView_android_focusable android:focusable}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_android_imeOptions android:imeOptions}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_android_inputType android:inputType}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_android_maxWidth android:maxWidth}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_closeIcon com.sirius:closeIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_commitIcon com.sirius:commitIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_defaultQueryHint com.sirius:defaultQueryHint}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_goIcon com.sirius:goIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_iconifiedByDefault com.sirius:iconifiedByDefault}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_layout com.sirius:layout}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_queryBackground com.sirius:queryBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_queryHint com.sirius:queryHint}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_searchHintIcon com.sirius:searchHintIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_searchIcon com.sirius:searchIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_submitBackground com.sirius:submitBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_suggestionRowLayout com.sirius:suggestionRowLayout}</code></td><td></td></tr>
               <tr><td><code>{@link #SearchView_voiceIcon com.sirius:voiceIcon}</code></td><td></td></tr>
               </table>
               @see #SearchView_android_focusable
               @see #SearchView_android_imeOptions
               @see #SearchView_android_inputType
               @see #SearchView_android_maxWidth
               @see #SearchView_closeIcon
               @see #SearchView_commitIcon
               @see #SearchView_defaultQueryHint
               @see #SearchView_goIcon
               @see #SearchView_iconifiedByDefault
               @see #SearchView_layout
               @see #SearchView_queryBackground
               @see #SearchView_queryHint
               @see #SearchView_searchHintIcon
               @see #SearchView_searchIcon
               @see #SearchView_submitBackground
               @see #SearchView_suggestionRowLayout
               @see #SearchView_voiceIcon
             */
            public static final int[] SearchView = {
                0x010100da, 0x0101011f, 0x01010220, 0x01010264,
                0x7f010114, 0x7f010115, 0x7f010116, 0x7f010117,
                0x7f010118, 0x7f010119, 0x7f01011a, 0x7f01011b,
                0x7f01011c, 0x7f01011d, 0x7f01011e, 0x7f01011f,
                0x7f010120
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#focusable}
              attribute's value can be found in the {@link #SearchView} array.
              @attr name android:focusable
            */
            public static final int SearchView_android_focusable = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#imeOptions}
              attribute's value can be found in the {@link #SearchView} array.
              @attr name android:imeOptions
            */
            public static final int SearchView_android_imeOptions = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#inputType}
              attribute's value can be found in the {@link #SearchView} array.
              @attr name android:inputType
            */
            public static final int SearchView_android_inputType = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#maxWidth}
              attribute's value can be found in the {@link #SearchView} array.
              @attr name android:maxWidth
            */
            public static final int SearchView_android_maxWidth = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#closeIcon}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:closeIcon
            */
            public static final int SearchView_closeIcon = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#commitIcon}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:commitIcon
            */
            public static final int SearchView_commitIcon = 13;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#defaultQueryHint}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:defaultQueryHint
            */
            public static final int SearchView_defaultQueryHint = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#goIcon}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:goIcon
            */
            public static final int SearchView_goIcon = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#iconifiedByDefault}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:iconifiedByDefault
            */
            public static final int SearchView_iconifiedByDefault = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#layout}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:layout
            */
            public static final int SearchView_layout = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#queryBackground}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:queryBackground
            */
            public static final int SearchView_queryBackground = 15;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#queryHint}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:queryHint
            */
            public static final int SearchView_queryHint = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#searchHintIcon}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:searchHintIcon
            */
            public static final int SearchView_searchHintIcon = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#searchIcon}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:searchIcon
            */
            public static final int SearchView_searchIcon = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#submitBackground}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:submitBackground
            */
            public static final int SearchView_submitBackground = 16;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#suggestionRowLayout}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:suggestionRowLayout
            */
            public static final int SearchView_suggestionRowLayout = 14;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#voiceIcon}
              attribute's value can be found in the {@link #SearchView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:voiceIcon
            */
            public static final int SearchView_voiceIcon = 12;
            /** Attributes that can be used with a Section.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #Section_indexPrefixes com.sirius:indexPrefixes}</code></td><td></td></tr>
               <tr><td><code>{@link #Section_noIndex com.sirius:noIndex}</code></td><td></td></tr>
               <tr><td><code>{@link #Section_schemaOrgProperty com.sirius:schemaOrgProperty}</code></td><td></td></tr>
               <tr><td><code>{@link #Section_sectionFormat com.sirius:sectionFormat}</code></td><td></td></tr>
               <tr><td><code>{@link #Section_sectionId com.sirius:sectionId}</code></td><td></td></tr>
               <tr><td><code>{@link #Section_sectionWeight com.sirius:sectionWeight}</code></td><td></td></tr>
               <tr><td><code>{@link #Section_subsectionSeparator com.sirius:subsectionSeparator}</code></td><td></td></tr>
               </table>
               @see #Section_indexPrefixes
               @see #Section_noIndex
               @see #Section_schemaOrgProperty
               @see #Section_sectionFormat
               @see #Section_sectionId
               @see #Section_sectionWeight
               @see #Section_subsectionSeparator
             */
            public static final int[] Section = {
                0x7f010121, 0x7f010122, 0x7f010123, 0x7f010124,
                0x7f010125, 0x7f010126, 0x7f010127
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#indexPrefixes}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:indexPrefixes
            */
            public static final int Section_indexPrefixes = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#noIndex}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:noIndex
            */
            public static final int Section_noIndex = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#schemaOrgProperty}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:schemaOrgProperty
            */
            public static final int Section_schemaOrgProperty = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#sectionFormat}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>plain</code></td><td>0</td><td></td></tr>
    <tr><td><code>html</code></td><td>1</td><td></td></tr>
    <tr><td><code>rfc822</code></td><td>2</td><td></td></tr>
    <tr><td><code>url</code></td><td>3</td><td></td></tr>
    <tr><td><code>date</code></td><td>4</td><td></td></tr>
    </table>
              @attr name com.sirius:sectionFormat
            */
            public static final int Section_sectionFormat = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#sectionId}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:sectionId
            */
            public static final int Section_sectionId = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#sectionWeight}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:sectionWeight
            */
            public static final int Section_sectionWeight = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subsectionSeparator}
              attribute's value can be found in the {@link #Section} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:subsectionSeparator
            */
            public static final int Section_subsectionSeparator = 5;
            /** Attributes that can be used with a SectionFeature.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #SectionFeature_featureType com.sirius:featureType}</code></td><td></td></tr>
               </table>
               @see #SectionFeature_featureType
             */
            public static final int[] SectionFeature = {
                0x7f010128
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#featureType}
              attribute's value can be found in the {@link #SectionFeature} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>match_global_nicknames</code></td><td>1</td><td></td></tr>
    <tr><td><code>demote_common_words</code></td><td>2</td><td></td></tr>
    <tr><td><code>demote_rfc822_hostnames</code></td><td>3</td><td></td></tr>
    <tr><td><code>omnibox_url_section</code></td><td>4</td><td></td></tr>
    <tr><td><code>omnibox_title_section</code></td><td>5</td><td></td></tr>
    <tr><td><code>index_entity_types</code></td><td>6</td><td></td></tr>
    </table>
              @attr name com.sirius:featureType
            */
            public static final int SectionFeature_featureType = 0;
            /** Attributes that can be used with a SignInButton.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #SignInButton_buttonSize com.sirius:buttonSize}</code></td><td></td></tr>
               <tr><td><code>{@link #SignInButton_colorScheme com.sirius:colorScheme}</code></td><td></td></tr>
               <tr><td><code>{@link #SignInButton_scopeUris com.sirius:scopeUris}</code></td><td></td></tr>
               </table>
               @see #SignInButton_buttonSize
               @see #SignInButton_colorScheme
               @see #SignInButton_scopeUris
             */
            public static final int[] SignInButton = {
                0x7f010129, 0x7f01012a, 0x7f01012b
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonSize}
              attribute's value can be found in the {@link #SignInButton} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>standard</code></td><td>0</td><td></td></tr>
    <tr><td><code>wide</code></td><td>1</td><td></td></tr>
    <tr><td><code>icon_only</code></td><td>2</td><td></td></tr>
    </table>
              @attr name com.sirius:buttonSize
            */
            public static final int SignInButton_buttonSize = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#colorScheme}
              attribute's value can be found in the {@link #SignInButton} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>dark</code></td><td>0</td><td></td></tr>
    <tr><td><code>light</code></td><td>1</td><td></td></tr>
    <tr><td><code>auto</code></td><td>2</td><td></td></tr>
    </table>
              @attr name com.sirius:colorScheme
            */
            public static final int SignInButton_colorScheme = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#scopeUris}
              attribute's value can be found in the {@link #SignInButton} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
              @attr name com.sirius:scopeUris
            */
            public static final int SignInButton_scopeUris = 2;
            /** Attributes that can be used with a SimpleDraweeView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #SimpleDraweeView_actualImageResource com.sirius:actualImageResource}</code></td><td></td></tr>
               <tr><td><code>{@link #SimpleDraweeView_actualImageUri com.sirius:actualImageUri}</code></td><td></td></tr>
               </table>
               @see #SimpleDraweeView_actualImageResource
               @see #SimpleDraweeView_actualImageUri
             */
            public static final int[] SimpleDraweeView = {
                0x7f01012c, 0x7f01012d
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actualImageResource}
              attribute's value can be found in the {@link #SimpleDraweeView} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:actualImageResource
            */
            public static final int SimpleDraweeView_actualImageResource = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#actualImageUri}
              attribute's value can be found in the {@link #SimpleDraweeView} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:actualImageUri
            */
            public static final int SimpleDraweeView_actualImageUri = 0;
            /** Attributes that can be used with a Spinner.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #Spinner_android_dropDownWidth android:dropDownWidth}</code></td><td></td></tr>
               <tr><td><code>{@link #Spinner_android_entries android:entries}</code></td><td></td></tr>
               <tr><td><code>{@link #Spinner_android_popupBackground android:popupBackground}</code></td><td></td></tr>
               <tr><td><code>{@link #Spinner_android_prompt android:prompt}</code></td><td></td></tr>
               <tr><td><code>{@link #Spinner_popupTheme com.sirius:popupTheme}</code></td><td></td></tr>
               </table>
               @see #Spinner_android_dropDownWidth
               @see #Spinner_android_entries
               @see #Spinner_android_popupBackground
               @see #Spinner_android_prompt
               @see #Spinner_popupTheme
             */
            public static final int[] Spinner = {
                0x010100b2, 0x01010176, 0x0101017b, 0x01010262,
                0x7f01001e
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#dropDownWidth}
              attribute's value can be found in the {@link #Spinner} array.
              @attr name android:dropDownWidth
            */
            public static final int Spinner_android_dropDownWidth = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#entries}
              attribute's value can be found in the {@link #Spinner} array.
              @attr name android:entries
            */
            public static final int Spinner_android_entries = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#popupBackground}
              attribute's value can be found in the {@link #Spinner} array.
              @attr name android:popupBackground
            */
            public static final int Spinner_android_popupBackground = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#prompt}
              attribute's value can be found in the {@link #Spinner} array.
              @attr name android:prompt
            */
            public static final int Spinner_android_prompt = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#popupTheme}
              attribute's value can be found in the {@link #Spinner} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:popupTheme
            */
            public static final int Spinner_popupTheme = 4;
            /** Attributes that can be used with a SwitchCompat.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #SwitchCompat_android_textOff android:textOff}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_android_textOn android:textOn}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_android_thumb android:thumb}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_showText com.sirius:showText}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_splitTrack com.sirius:splitTrack}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_switchMinWidth com.sirius:switchMinWidth}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_switchPadding com.sirius:switchPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_switchTextAppearance com.sirius:switchTextAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_thumbTextPadding com.sirius:thumbTextPadding}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_thumbTint com.sirius:thumbTint}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_thumbTintMode com.sirius:thumbTintMode}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_track com.sirius:track}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_trackTint com.sirius:trackTint}</code></td><td></td></tr>
               <tr><td><code>{@link #SwitchCompat_trackTintMode com.sirius:trackTintMode}</code></td><td></td></tr>
               </table>
               @see #SwitchCompat_android_textOff
               @see #SwitchCompat_android_textOn
               @see #SwitchCompat_android_thumb
               @see #SwitchCompat_showText
               @see #SwitchCompat_splitTrack
               @see #SwitchCompat_switchMinWidth
               @see #SwitchCompat_switchPadding
               @see #SwitchCompat_switchTextAppearance
               @see #SwitchCompat_thumbTextPadding
               @see #SwitchCompat_thumbTint
               @see #SwitchCompat_thumbTintMode
               @see #SwitchCompat_track
               @see #SwitchCompat_trackTint
               @see #SwitchCompat_trackTintMode
             */
            public static final int[] SwitchCompat = {
                0x01010124, 0x01010125, 0x01010142, 0x7f01012e,
                0x7f01012f, 0x7f010130, 0x7f010131, 0x7f010132,
                0x7f010133, 0x7f010134, 0x7f010135, 0x7f010136,
                0x7f010137, 0x7f010138
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textOff}
              attribute's value can be found in the {@link #SwitchCompat} array.
              @attr name android:textOff
            */
            public static final int SwitchCompat_android_textOff = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textOn}
              attribute's value can be found in the {@link #SwitchCompat} array.
              @attr name android:textOn
            */
            public static final int SwitchCompat_android_textOn = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#thumb}
              attribute's value can be found in the {@link #SwitchCompat} array.
              @attr name android:thumb
            */
            public static final int SwitchCompat_android_thumb = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#showText}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:showText
            */
            public static final int SwitchCompat_showText = 13;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#splitTrack}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:splitTrack
            */
            public static final int SwitchCompat_splitTrack = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#switchMinWidth}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:switchMinWidth
            */
            public static final int SwitchCompat_switchMinWidth = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#switchPadding}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:switchPadding
            */
            public static final int SwitchCompat_switchPadding = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#switchTextAppearance}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:switchTextAppearance
            */
            public static final int SwitchCompat_switchTextAppearance = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#thumbTextPadding}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:thumbTextPadding
            */
            public static final int SwitchCompat_thumbTextPadding = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#thumbTint}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:thumbTint
            */
            public static final int SwitchCompat_thumbTint = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#thumbTintMode}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:thumbTintMode
            */
            public static final int SwitchCompat_thumbTintMode = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#track}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:track
            */
            public static final int SwitchCompat_track = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#trackTint}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:trackTint
            */
            public static final int SwitchCompat_trackTint = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#trackTintMode}
              attribute's value can be found in the {@link #SwitchCompat} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:trackTintMode
            */
            public static final int SwitchCompat_trackTintMode = 7;
            /** Attributes that can be used with a TextAppearance.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #TextAppearance_android_fontFamily android:fontFamily}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_shadowColor android:shadowColor}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_shadowDx android:shadowDx}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_shadowDy android:shadowDy}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_shadowRadius android:shadowRadius}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_textColor android:textColor}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_textColorHint android:textColorHint}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_textColorLink android:textColorLink}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_textSize android:textSize}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_textStyle android:textStyle}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_android_typeface android:typeface}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_fontFamily com.sirius:fontFamily}</code></td><td></td></tr>
               <tr><td><code>{@link #TextAppearance_textAllCaps com.sirius:textAllCaps}</code></td><td></td></tr>
               </table>
               @see #TextAppearance_android_fontFamily
               @see #TextAppearance_android_shadowColor
               @see #TextAppearance_android_shadowDx
               @see #TextAppearance_android_shadowDy
               @see #TextAppearance_android_shadowRadius
               @see #TextAppearance_android_textColor
               @see #TextAppearance_android_textColorHint
               @see #TextAppearance_android_textColorLink
               @see #TextAppearance_android_textSize
               @see #TextAppearance_android_textStyle
               @see #TextAppearance_android_typeface
               @see #TextAppearance_fontFamily
               @see #TextAppearance_textAllCaps
             */
            public static final int[] TextAppearance = {
                0x01010095, 0x01010096, 0x01010097, 0x01010098,
                0x0101009a, 0x0101009b, 0x01010161, 0x01010162,
                0x01010163, 0x01010164, 0x010103ac, 0x7f010032,
                0x7f010038
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#fontFamily}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:fontFamily
            */
            public static final int TextAppearance_android_fontFamily = 10;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowColor}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:shadowColor
            */
            public static final int TextAppearance_android_shadowColor = 6;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowDx}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:shadowDx
            */
            public static final int TextAppearance_android_shadowDx = 7;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowDy}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:shadowDy
            */
            public static final int TextAppearance_android_shadowDy = 8;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowRadius}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:shadowRadius
            */
            public static final int TextAppearance_android_shadowRadius = 9;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textColor}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:textColor
            */
            public static final int TextAppearance_android_textColor = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textColorHint}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:textColorHint
            */
            public static final int TextAppearance_android_textColorHint = 4;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textColorLink}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:textColorLink
            */
            public static final int TextAppearance_android_textColorLink = 5;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textSize}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:textSize
            */
            public static final int TextAppearance_android_textSize = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textStyle}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:textStyle
            */
            public static final int TextAppearance_android_textStyle = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#typeface}
              attribute's value can be found in the {@link #TextAppearance} array.
              @attr name android:typeface
            */
            public static final int TextAppearance_android_typeface = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#fontFamily}
              attribute's value can be found in the {@link #TextAppearance} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:fontFamily
            */
            public static final int TextAppearance_fontFamily = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#textAllCaps}
              attribute's value can be found in the {@link #TextAppearance} array.


              <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
    <p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
              @attr name com.sirius:textAllCaps
            */
            public static final int TextAppearance_textAllCaps = 11;
            /** Attributes that can be used with a TextStyle.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #TextStyle_android_ellipsize android:ellipsize}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_maxLines android:maxLines}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_shadowColor android:shadowColor}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_shadowDx android:shadowDx}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_shadowDy android:shadowDy}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_shadowRadius android:shadowRadius}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_singleLine android:singleLine}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_textAppearance android:textAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_textColor android:textColor}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_textSize android:textSize}</code></td><td></td></tr>
               <tr><td><code>{@link #TextStyle_android_textStyle android:textStyle}</code></td><td></td></tr>
               </table>
               @see #TextStyle_android_ellipsize
               @see #TextStyle_android_maxLines
               @see #TextStyle_android_shadowColor
               @see #TextStyle_android_shadowDx
               @see #TextStyle_android_shadowDy
               @see #TextStyle_android_shadowRadius
               @see #TextStyle_android_singleLine
               @see #TextStyle_android_textAppearance
               @see #TextStyle_android_textColor
               @see #TextStyle_android_textSize
               @see #TextStyle_android_textStyle
             */
            public static final int[] TextStyle = {
                0x01010034, 0x01010095, 0x01010097, 0x01010098,
                0x010100ab, 0x01010153, 0x0101015d, 0x01010161,
                0x01010162, 0x01010163, 0x01010164
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#ellipsize}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:ellipsize
            */
            public static final int TextStyle_android_ellipsize = 4;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#maxLines}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:maxLines
            */
            public static final int TextStyle_android_maxLines = 5;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowColor}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:shadowColor
            */
            public static final int TextStyle_android_shadowColor = 7;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowDx}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:shadowDx
            */
            public static final int TextStyle_android_shadowDx = 8;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowDy}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:shadowDy
            */
            public static final int TextStyle_android_shadowDy = 9;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#shadowRadius}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:shadowRadius
            */
            public static final int TextStyle_android_shadowRadius = 10;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#singleLine}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:singleLine
            */
            public static final int TextStyle_android_singleLine = 6;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textAppearance}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:textAppearance
            */
            public static final int TextStyle_android_textAppearance = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textColor}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:textColor
            */
            public static final int TextStyle_android_textColor = 3;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textSize}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:textSize
            */
            public static final int TextStyle_android_textSize = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#textStyle}
              attribute's value can be found in the {@link #TextStyle} array.
              @attr name android:textStyle
            */
            public static final int TextStyle_android_textStyle = 2;
            /** Attributes that can be used with a Toolbar.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #Toolbar_android_gravity android:gravity}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_android_minHeight android:minHeight}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_buttonGravity com.sirius:buttonGravity}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_collapseContentDescription com.sirius:collapseContentDescription}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_collapseIcon com.sirius:collapseIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_contentInsetEnd com.sirius:contentInsetEnd}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_contentInsetEndWithActions com.sirius:contentInsetEndWithActions}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_contentInsetLeft com.sirius:contentInsetLeft}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_contentInsetRight com.sirius:contentInsetRight}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_contentInsetStart com.sirius:contentInsetStart}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_contentInsetStartWithNavigation com.sirius:contentInsetStartWithNavigation}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_logo com.sirius:logo}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_logoDescription com.sirius:logoDescription}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_maxButtonHeight com.sirius:maxButtonHeight}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_navigationContentDescription com.sirius:navigationContentDescription}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_navigationIcon com.sirius:navigationIcon}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_popupTheme com.sirius:popupTheme}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_subtitle com.sirius:subtitle}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_subtitleTextAppearance com.sirius:subtitleTextAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_subtitleTextColor com.sirius:subtitleTextColor}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_title com.sirius:title}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleMargin com.sirius:titleMargin}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleMarginBottom com.sirius:titleMarginBottom}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleMarginEnd com.sirius:titleMarginEnd}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleMarginStart com.sirius:titleMarginStart}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleMarginTop com.sirius:titleMarginTop}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleMargins com.sirius:titleMargins}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleTextAppearance com.sirius:titleTextAppearance}</code></td><td></td></tr>
               <tr><td><code>{@link #Toolbar_titleTextColor com.sirius:titleTextColor}</code></td><td></td></tr>
               </table>
               @see #Toolbar_android_gravity
               @see #Toolbar_android_minHeight
               @see #Toolbar_buttonGravity
               @see #Toolbar_collapseContentDescription
               @see #Toolbar_collapseIcon
               @see #Toolbar_contentInsetEnd
               @see #Toolbar_contentInsetEndWithActions
               @see #Toolbar_contentInsetLeft
               @see #Toolbar_contentInsetRight
               @see #Toolbar_contentInsetStart
               @see #Toolbar_contentInsetStartWithNavigation
               @see #Toolbar_logo
               @see #Toolbar_logoDescription
               @see #Toolbar_maxButtonHeight
               @see #Toolbar_navigationContentDescription
               @see #Toolbar_navigationIcon
               @see #Toolbar_popupTheme
               @see #Toolbar_subtitle
               @see #Toolbar_subtitleTextAppearance
               @see #Toolbar_subtitleTextColor
               @see #Toolbar_title
               @see #Toolbar_titleMargin
               @see #Toolbar_titleMarginBottom
               @see #Toolbar_titleMarginEnd
               @see #Toolbar_titleMarginStart
               @see #Toolbar_titleMarginTop
               @see #Toolbar_titleMargins
               @see #Toolbar_titleTextAppearance
               @see #Toolbar_titleTextColor
             */
            public static final int[] Toolbar = {
                0x010100af, 0x01010140, 0x7f010004, 0x7f010007,
                0x7f01000b, 0x7f010017, 0x7f010018, 0x7f010019,
                0x7f01001a, 0x7f01001b, 0x7f01001c, 0x7f01001e,
                0x7f010139, 0x7f01013a, 0x7f01013b, 0x7f01013c,
                0x7f01013d, 0x7f01013e, 0x7f01013f, 0x7f010140,
                0x7f010141, 0x7f010142, 0x7f010143, 0x7f010144,
                0x7f010145, 0x7f010146, 0x7f010147, 0x7f010148,
                0x7f010149
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#gravity}
              attribute's value can be found in the {@link #Toolbar} array.
              @attr name android:gravity
            */
            public static final int Toolbar_android_gravity = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#minHeight}
              attribute's value can be found in the {@link #Toolbar} array.
              @attr name android:minHeight
            */
            public static final int Toolbar_android_minHeight = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#buttonGravity}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be one or more (separated by '|') of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>top</code></td><td>0x30</td><td></td></tr>
    <tr><td><code>bottom</code></td><td>0x50</td><td></td></tr>
    </table>
              @attr name com.sirius:buttonGravity
            */
            public static final int Toolbar_buttonGravity = 21;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#collapseContentDescription}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:collapseContentDescription
            */
            public static final int Toolbar_collapseContentDescription = 23;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#collapseIcon}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:collapseIcon
            */
            public static final int Toolbar_collapseIcon = 22;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetEnd}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetEnd
            */
            public static final int Toolbar_contentInsetEnd = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetEndWithActions}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetEndWithActions
            */
            public static final int Toolbar_contentInsetEndWithActions = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetLeft}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetLeft
            */
            public static final int Toolbar_contentInsetLeft = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetRight}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetRight
            */
            public static final int Toolbar_contentInsetRight = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetStart}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetStart
            */
            public static final int Toolbar_contentInsetStart = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#contentInsetStartWithNavigation}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:contentInsetStartWithNavigation
            */
            public static final int Toolbar_contentInsetStartWithNavigation = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#logo}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:logo
            */
            public static final int Toolbar_logo = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#logoDescription}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:logoDescription
            */
            public static final int Toolbar_logoDescription = 26;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#maxButtonHeight}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:maxButtonHeight
            */
            public static final int Toolbar_maxButtonHeight = 20;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#navigationContentDescription}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:navigationContentDescription
            */
            public static final int Toolbar_navigationContentDescription = 25;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#navigationIcon}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:navigationIcon
            */
            public static final int Toolbar_navigationIcon = 24;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#popupTheme}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:popupTheme
            */
            public static final int Toolbar_popupTheme = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subtitle}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:subtitle
            */
            public static final int Toolbar_subtitle = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subtitleTextAppearance}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:subtitleTextAppearance
            */
            public static final int Toolbar_subtitleTextAppearance = 13;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#subtitleTextColor}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:subtitleTextColor
            */
            public static final int Toolbar_subtitleTextColor = 28;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#title}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:title
            */
            public static final int Toolbar_title = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleMargin}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleMargin
            */
            public static final int Toolbar_titleMargin = 14;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleMarginBottom}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleMarginBottom
            */
            public static final int Toolbar_titleMarginBottom = 18;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleMarginEnd}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleMarginEnd
            */
            public static final int Toolbar_titleMarginEnd = 16;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleMarginStart}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleMarginStart
            */
            public static final int Toolbar_titleMarginStart = 15;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleMarginTop}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleMarginTop
            */
            public static final int Toolbar_titleMarginTop = 17;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleMargins}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleMargins
            */
            public static final int Toolbar_titleMargins = 19;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleTextAppearance}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:titleTextAppearance
            */
            public static final int Toolbar_titleTextAppearance = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#titleTextColor}
              attribute's value can be found in the {@link #Toolbar} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:titleTextColor
            */
            public static final int Toolbar_titleTextColor = 27;
            /** Attributes that can be used with a View.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #View_android_focusable android:focusable}</code></td><td></td></tr>
               <tr><td><code>{@link #View_android_theme android:theme}</code></td><td></td></tr>
               <tr><td><code>{@link #View_paddingEnd com.sirius:paddingEnd}</code></td><td></td></tr>
               <tr><td><code>{@link #View_paddingStart com.sirius:paddingStart}</code></td><td></td></tr>
               <tr><td><code>{@link #View_theme com.sirius:theme}</code></td><td></td></tr>
               </table>
               @see #View_android_focusable
               @see #View_android_theme
               @see #View_paddingEnd
               @see #View_paddingStart
               @see #View_theme
             */
            public static final int[] View = {
                0x01010000, 0x010100da, 0x7f01014a, 0x7f01014b,
                0x7f01014c
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#focusable}
              attribute's value can be found in the {@link #View} array.
              @attr name android:focusable
            */
            public static final int View_android_focusable = 1;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#theme}
              attribute's value can be found in the {@link #View} array.
              @attr name android:theme
            */
            public static final int View_android_theme = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#paddingEnd}
              attribute's value can be found in the {@link #View} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:paddingEnd
            */
            public static final int View_paddingEnd = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#paddingStart}
              attribute's value can be found in the {@link #View} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:paddingStart
            */
            public static final int View_paddingStart = 2;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#theme}
              attribute's value can be found in the {@link #View} array.


              <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
    or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
              @attr name com.sirius:theme
            */
            public static final int View_theme = 4;
            /** Attributes that can be used with a ViewBackgroundHelper.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ViewBackgroundHelper_android_background android:background}</code></td><td></td></tr>
               <tr><td><code>{@link #ViewBackgroundHelper_backgroundTint com.sirius:backgroundTint}</code></td><td></td></tr>
               <tr><td><code>{@link #ViewBackgroundHelper_backgroundTintMode com.sirius:backgroundTintMode}</code></td><td></td></tr>
               </table>
               @see #ViewBackgroundHelper_android_background
               @see #ViewBackgroundHelper_backgroundTint
               @see #ViewBackgroundHelper_backgroundTintMode
             */
            public static final int[] ViewBackgroundHelper = {
                0x010100d4, 0x7f01014d, 0x7f01014e
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#background}
              attribute's value can be found in the {@link #ViewBackgroundHelper} array.
              @attr name android:background
            */
            public static final int ViewBackgroundHelper_android_background = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#backgroundTint}
              attribute's value can be found in the {@link #ViewBackgroundHelper} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:backgroundTint
            */
            public static final int ViewBackgroundHelper_backgroundTint = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#backgroundTintMode}
              attribute's value can be found in the {@link #ViewBackgroundHelper} array.


              <p>Must be one of the following constant values.</p>
    <table>
    <colgroup align="left" />
    <colgroup align="left" />
    <colgroup align="left" />
    <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
    <tr><td><code>src_over</code></td><td>3</td><td></td></tr>
    <tr><td><code>src_in</code></td><td>5</td><td></td></tr>
    <tr><td><code>src_atop</code></td><td>9</td><td></td></tr>
    <tr><td><code>multiply</code></td><td>14</td><td></td></tr>
    <tr><td><code>screen</code></td><td>15</td><td></td></tr>
    <tr><td><code>add</code></td><td>16</td><td></td></tr>
    </table>
              @attr name com.sirius:backgroundTintMode
            */
            public static final int ViewBackgroundHelper_backgroundTintMode = 2;
            /** Attributes that can be used with a ViewStubCompat.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ViewStubCompat_android_id android:id}</code></td><td></td></tr>
               <tr><td><code>{@link #ViewStubCompat_android_inflatedId android:inflatedId}</code></td><td></td></tr>
               <tr><td><code>{@link #ViewStubCompat_android_layout android:layout}</code></td><td></td></tr>
               </table>
               @see #ViewStubCompat_android_id
               @see #ViewStubCompat_android_inflatedId
               @see #ViewStubCompat_android_layout
             */
            public static final int[] ViewStubCompat = {
                0x010100d0, 0x010100f2, 0x010100f3
            };
            /**
              <p>This symbol is the offset where the {@link android.R.attr#id}
              attribute's value can be found in the {@link #ViewStubCompat} array.
              @attr name android:id
            */
            public static final int ViewStubCompat_android_id = 0;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#inflatedId}
              attribute's value can be found in the {@link #ViewStubCompat} array.
              @attr name android:inflatedId
            */
            public static final int ViewStubCompat_android_inflatedId = 2;
            /**
              <p>This symbol is the offset where the {@link android.R.attr#layout}
              attribute's value can be found in the {@link #ViewStubCompat} array.
              @attr name android:layout
            */
            public static final int ViewStubCompat_android_layout = 1;
            /** Attributes that can be used with a ucrop_AspectRatioTextView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ucrop_AspectRatioTextView_ucrop_artv_ratio_title com.sirius:ucrop_artv_ratio_title}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_AspectRatioTextView_ucrop_artv_ratio_x com.sirius:ucrop_artv_ratio_x}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_AspectRatioTextView_ucrop_artv_ratio_y com.sirius:ucrop_artv_ratio_y}</code></td><td></td></tr>
               </table>
               @see #ucrop_AspectRatioTextView_ucrop_artv_ratio_title
               @see #ucrop_AspectRatioTextView_ucrop_artv_ratio_x
               @see #ucrop_AspectRatioTextView_ucrop_artv_ratio_y
             */
            public static final int[] ucrop_AspectRatioTextView = {
                0x7f01014f, 0x7f010150, 0x7f010151
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_artv_ratio_title}
              attribute's value can be found in the {@link #ucrop_AspectRatioTextView} array.


              <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_artv_ratio_title
            */
            public static final int ucrop_AspectRatioTextView_ucrop_artv_ratio_title = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_artv_ratio_x}
              attribute's value can be found in the {@link #ucrop_AspectRatioTextView} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_artv_ratio_x
            */
            public static final int ucrop_AspectRatioTextView_ucrop_artv_ratio_x = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_artv_ratio_y}
              attribute's value can be found in the {@link #ucrop_AspectRatioTextView} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_artv_ratio_y
            */
            public static final int ucrop_AspectRatioTextView_ucrop_artv_ratio_y = 2;
            /** Attributes that can be used with a ucrop_UCropView.
               <p>Includes the following attributes:</p>
               <table>
               <colgroup align="left" />
               <colgroup align="left" />
               <tr><th>Attribute</th><th>Description</th></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_aspect_ratio_x com.sirius:ucrop_aspect_ratio_x}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_aspect_ratio_y com.sirius:ucrop_aspect_ratio_y}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_circle_dimmed_layer com.sirius:ucrop_circle_dimmed_layer}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_dimmed_color com.sirius:ucrop_dimmed_color}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_frame_color com.sirius:ucrop_frame_color}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_frame_stroke_size com.sirius:ucrop_frame_stroke_size}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_grid_color com.sirius:ucrop_grid_color}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_grid_column_count com.sirius:ucrop_grid_column_count}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_grid_row_count com.sirius:ucrop_grid_row_count}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_grid_stroke_size com.sirius:ucrop_grid_stroke_size}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_show_frame com.sirius:ucrop_show_frame}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_show_grid com.sirius:ucrop_show_grid}</code></td><td></td></tr>
               <tr><td><code>{@link #ucrop_UCropView_ucrop_show_oval_crop_frame com.sirius:ucrop_show_oval_crop_frame}</code></td><td></td></tr>
               </table>
               @see #ucrop_UCropView_ucrop_aspect_ratio_x
               @see #ucrop_UCropView_ucrop_aspect_ratio_y
               @see #ucrop_UCropView_ucrop_circle_dimmed_layer
               @see #ucrop_UCropView_ucrop_dimmed_color
               @see #ucrop_UCropView_ucrop_frame_color
               @see #ucrop_UCropView_ucrop_frame_stroke_size
               @see #ucrop_UCropView_ucrop_grid_color
               @see #ucrop_UCropView_ucrop_grid_column_count
               @see #ucrop_UCropView_ucrop_grid_row_count
               @see #ucrop_UCropView_ucrop_grid_stroke_size
               @see #ucrop_UCropView_ucrop_show_frame
               @see #ucrop_UCropView_ucrop_show_grid
               @see #ucrop_UCropView_ucrop_show_oval_crop_frame
             */
            public static final int[] ucrop_UCropView = {
                0x7f010152, 0x7f010153, 0x7f010154, 0x7f010155,
                0x7f010156, 0x7f010157, 0x7f010158, 0x7f010159,
                0x7f01015a, 0x7f01015b, 0x7f01015c, 0x7f01015d,
                0x7f01015e
            };
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_aspect_ratio_x}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_aspect_ratio_x
            */
            public static final int ucrop_UCropView_ucrop_aspect_ratio_x = 0;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_aspect_ratio_y}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a floating point value, such as "<code>1.2</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_aspect_ratio_y
            */
            public static final int ucrop_UCropView_ucrop_aspect_ratio_y = 1;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_circle_dimmed_layer}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_circle_dimmed_layer
            */
            public static final int ucrop_UCropView_ucrop_circle_dimmed_layer = 3;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_dimmed_color}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_dimmed_color
            */
            public static final int ucrop_UCropView_ucrop_dimmed_color = 4;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_frame_color}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_frame_color
            */
            public static final int ucrop_UCropView_ucrop_frame_color = 11;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_frame_stroke_size}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_frame_stroke_size
            */
            public static final int ucrop_UCropView_ucrop_frame_stroke_size = 10;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_grid_color}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
    "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_grid_color
            */
            public static final int ucrop_UCropView_ucrop_grid_color = 6;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_grid_column_count}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_grid_column_count
            */
            public static final int ucrop_UCropView_ucrop_grid_column_count = 8;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_grid_row_count}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be an integer value, such as "<code>100</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_grid_row_count
            */
            public static final int ucrop_UCropView_ucrop_grid_row_count = 7;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_grid_stroke_size}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
    Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
    in (inches), mm (millimeters).
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_grid_stroke_size
            */
            public static final int ucrop_UCropView_ucrop_grid_stroke_size = 5;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_show_frame}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_show_frame
            */
            public static final int ucrop_UCropView_ucrop_show_frame = 12;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_show_grid}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_show_grid
            */
            public static final int ucrop_UCropView_ucrop_show_grid = 9;
            /**
              <p>This symbol is the offset where the {@link com.sirius.R.attr#ucrop_show_oval_crop_frame}
              attribute's value can be found in the {@link #ucrop_UCropView} array.


              <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
    <p>This may also be a reference to a resource (in the form
    "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
    theme attribute (in the form
    "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
    containing a value of this type.
              @attr name com.sirius:ucrop_show_oval_crop_frame
            */
            public static final int ucrop_UCropView_ucrop_show_oval_crop_frame = 2;
        };
    }
}
