package subProj_159

import subProj_159.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_159")
    name = "subProj 159"

    buildType(subProj_bt_159_0)
    buildType(subProj_bt_159_1)
    buildType(subProj_bt_159_2)
    buildType(subProj_bt_159_3)
    buildType(subProj_bt_159_4)
    buildType(subProj_bt_159_5)
})
