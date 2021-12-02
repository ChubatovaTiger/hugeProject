package subProj_741

import subProj_741.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_741")
    name = "subProj 741"

    buildType(subProj_bt_741_4)
    buildType(subProj_bt_741_5)
    buildType(subProj_bt_741_0)
    buildType(subProj_bt_741_1)
    buildType(subProj_bt_741_2)
    buildType(subProj_bt_741_3)
})
