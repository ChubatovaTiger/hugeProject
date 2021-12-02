package subProj_728

import subProj_728.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_728")
    name = "subProj 728"

    buildType(subProj_bt_728_2)
    buildType(subProj_bt_728_1)
    buildType(subProj_bt_728_0)
    buildType(subProj_bt_728_5)
    buildType(subProj_bt_728_4)
    buildType(subProj_bt_728_3)
})
