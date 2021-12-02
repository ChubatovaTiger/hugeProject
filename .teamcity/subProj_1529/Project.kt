package subProj_1529

import subProj_1529.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1529")
    name = "subProj 1529"

    buildType(subProj_bt_1529_1)
    buildType(subProj_bt_1529_2)
    buildType(subProj_bt_1529_0)
    buildType(subProj_bt_1529_5)
    buildType(subProj_bt_1529_3)
    buildType(subProj_bt_1529_4)
})
