package subProj_1957

import subProj_1957.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1957")
    name = "subProj 1957"

    buildType(subProj_bt_1957_4)
    buildType(subProj_bt_1957_5)
    buildType(subProj_bt_1957_0)
    buildType(subProj_bt_1957_1)
    buildType(subProj_bt_1957_2)
    buildType(subProj_bt_1957_3)
})
