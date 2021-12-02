package subProj_41

import subProj_41.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_41")
    name = "subProj 41"

    buildType(subProj_bt_41_0)
    buildType(subProj_bt_41_2)
    buildType(subProj_bt_41_1)
    buildType(subProj_bt_41_4)
    buildType(subProj_bt_41_3)
    buildType(subProj_bt_41_5)
})
