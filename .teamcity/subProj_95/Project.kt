package subProj_95

import subProj_95.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_95")
    name = "subProj 95"

    buildType(subProj_bt_95_1)
    buildType(subProj_bt_95_0)
    buildType(subProj_bt_95_5)
    buildType(subProj_bt_95_4)
    buildType(subProj_bt_95_3)
    buildType(subProj_bt_95_2)
})
