package subProj_1737

import subProj_1737.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1737")
    name = "subProj 1737"

    buildType(subProj_bt_1737_4)
    buildType(subProj_bt_1737_5)
    buildType(subProj_bt_1737_2)
    buildType(subProj_bt_1737_3)
    buildType(subProj_bt_1737_0)
    buildType(subProj_bt_1737_1)
})
