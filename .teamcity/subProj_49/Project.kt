package subProj_49

import subProj_49.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_49")
    name = "subProj 49"

    buildType(subProj_bt_49_5)
    buildType(subProj_bt_49_0)
    buildType(subProj_bt_49_2)
    buildType(subProj_bt_49_1)
    buildType(subProj_bt_49_4)
    buildType(subProj_bt_49_3)
})
