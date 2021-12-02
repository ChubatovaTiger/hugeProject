package subProj_5

import subProj_5.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_5")
    name = "subProj 5"

    buildType(subProj_bt_5_1)
    buildType(subProj_bt_5_2)
    buildType(subProj_bt_5_0)
    buildType(subProj_bt_5_5)
    buildType(subProj_bt_5_3)
    buildType(subProj_bt_5_4)
})
