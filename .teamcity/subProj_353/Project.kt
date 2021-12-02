package subProj_353

import subProj_353.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_353")
    name = "subProj 353"

    buildType(subProj_bt_353_3)
    buildType(subProj_bt_353_4)
    buildType(subProj_bt_353_5)
    buildType(subProj_bt_353_0)
    buildType(subProj_bt_353_1)
    buildType(subProj_bt_353_2)
})
