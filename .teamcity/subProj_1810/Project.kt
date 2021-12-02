package subProj_1810

import subProj_1810.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1810")
    name = "subProj 1810"

    buildType(subProj_bt_1810_0)
    buildType(subProj_bt_1810_1)
    buildType(subProj_bt_1810_2)
    buildType(subProj_bt_1810_3)
    buildType(subProj_bt_1810_4)
    buildType(subProj_bt_1810_5)
})
