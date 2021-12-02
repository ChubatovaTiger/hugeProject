package subProj_1785

import subProj_1785.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1785")
    name = "subProj 1785"

    buildType(subProj_bt_1785_0)
    buildType(subProj_bt_1785_2)
    buildType(subProj_bt_1785_1)
    buildType(subProj_bt_1785_4)
    buildType(subProj_bt_1785_3)
    buildType(subProj_bt_1785_5)
})
