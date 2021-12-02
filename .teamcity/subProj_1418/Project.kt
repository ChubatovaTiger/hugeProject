package subProj_1418

import subProj_1418.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1418")
    name = "subProj 1418"

    buildType(subProj_bt_1418_3)
    buildType(subProj_bt_1418_2)
    buildType(subProj_bt_1418_1)
    buildType(subProj_bt_1418_0)
    buildType(subProj_bt_1418_5)
    buildType(subProj_bt_1418_4)
})
