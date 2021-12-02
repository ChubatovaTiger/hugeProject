package subProj_1407

import subProj_1407.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1407")
    name = "subProj 1407"

    buildType(subProj_bt_1407_3)
    buildType(subProj_bt_1407_2)
    buildType(subProj_bt_1407_1)
    buildType(subProj_bt_1407_0)
    buildType(subProj_bt_1407_5)
    buildType(subProj_bt_1407_4)
})
