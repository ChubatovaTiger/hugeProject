package subProj_810

import subProj_810.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_810")
    name = "subProj 810"

    buildType(subProj_bt_810_5)
    buildType(subProj_bt_810_0)
    buildType(subProj_bt_810_2)
    buildType(subProj_bt_810_1)
    buildType(subProj_bt_810_4)
    buildType(subProj_bt_810_3)
})
