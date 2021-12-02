package subProj_784

import subProj_784.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_784")
    name = "subProj 784"

    buildType(subProj_bt_784_0)
    buildType(subProj_bt_784_5)
    buildType(subProj_bt_784_3)
    buildType(subProj_bt_784_4)
    buildType(subProj_bt_784_1)
    buildType(subProj_bt_784_2)
})
