package subProj_1983

import subProj_1983.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1983")
    name = "subProj 1983"

    buildType(subProj_bt_1983_4)
    buildType(subProj_bt_1983_3)
    buildType(subProj_bt_1983_5)
    buildType(subProj_bt_1983_0)
    buildType(subProj_bt_1983_2)
    buildType(subProj_bt_1983_1)
})
