package subProj_931

import subProj_931.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_931")
    name = "subProj 931"

    buildType(subProj_bt_931_5)
    buildType(subProj_bt_931_0)
    buildType(subProj_bt_931_1)
    buildType(subProj_bt_931_2)
    buildType(subProj_bt_931_3)
    buildType(subProj_bt_931_4)
})
