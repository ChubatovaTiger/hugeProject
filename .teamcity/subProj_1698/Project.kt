package subProj_1698

import subProj_1698.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1698")
    name = "subProj 1698"

    buildType(subProj_bt_1698_1)
    buildType(subProj_bt_1698_0)
    buildType(subProj_bt_1698_5)
    buildType(subProj_bt_1698_4)
    buildType(subProj_bt_1698_3)
    buildType(subProj_bt_1698_2)
})
