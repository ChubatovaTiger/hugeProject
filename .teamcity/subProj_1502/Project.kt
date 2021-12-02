package subProj_1502

import subProj_1502.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1502")
    name = "subProj 1502"

    buildType(subProj_bt_1502_5)
    buildType(subProj_bt_1502_4)
    buildType(subProj_bt_1502_1)
    buildType(subProj_bt_1502_0)
    buildType(subProj_bt_1502_3)
    buildType(subProj_bt_1502_2)
})
