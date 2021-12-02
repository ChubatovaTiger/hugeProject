package subProj_785

import subProj_785.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_785")
    name = "subProj 785"

    buildType(subProj_bt_785_4)
    buildType(subProj_bt_785_5)
    buildType(subProj_bt_785_2)
    buildType(subProj_bt_785_3)
    buildType(subProj_bt_785_0)
    buildType(subProj_bt_785_1)
})
