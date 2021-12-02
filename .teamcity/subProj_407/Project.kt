package subProj_407

import subProj_407.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_407")
    name = "subProj 407"

    buildType(subProj_bt_407_0)
    buildType(subProj_bt_407_1)
    buildType(subProj_bt_407_2)
    buildType(subProj_bt_407_3)
    buildType(subProj_bt_407_4)
    buildType(subProj_bt_407_5)
})
