package subProj_1092

import subProj_1092.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1092")
    name = "subProj 1092"

    buildType(subProj_bt_1092_0)
    buildType(subProj_bt_1092_1)
    buildType(subProj_bt_1092_4)
    buildType(subProj_bt_1092_5)
    buildType(subProj_bt_1092_2)
    buildType(subProj_bt_1092_3)
})
