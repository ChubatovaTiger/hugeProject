package subProj_1083

import subProj_1083.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1083")
    name = "subProj 1083"

    buildType(subProj_bt_1083_4)
    buildType(subProj_bt_1083_5)
    buildType(subProj_bt_1083_2)
    buildType(subProj_bt_1083_3)
    buildType(subProj_bt_1083_0)
    buildType(subProj_bt_1083_1)
})
