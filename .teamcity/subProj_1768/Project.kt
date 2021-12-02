package subProj_1768

import subProj_1768.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1768")
    name = "subProj 1768"

    buildType(subProj_bt_1768_2)
    buildType(subProj_bt_1768_3)
    buildType(subProj_bt_1768_4)
    buildType(subProj_bt_1768_5)
    buildType(subProj_bt_1768_0)
    buildType(subProj_bt_1768_1)
})
