package subProj_1159

import subProj_1159.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1159")
    name = "subProj 1159"

    buildType(subProj_bt_1159_1)
    buildType(subProj_bt_1159_0)
    buildType(subProj_bt_1159_5)
    buildType(subProj_bt_1159_4)
    buildType(subProj_bt_1159_3)
    buildType(subProj_bt_1159_2)
})
