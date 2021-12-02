package subProj_1892

import subProj_1892.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1892")
    name = "subProj 1892"

    buildType(subProj_bt_1892_5)
    buildType(subProj_bt_1892_4)
    buildType(subProj_bt_1892_3)
    buildType(subProj_bt_1892_2)
    buildType(subProj_bt_1892_1)
    buildType(subProj_bt_1892_0)
})
