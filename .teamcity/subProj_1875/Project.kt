package subProj_1875

import subProj_1875.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1875")
    name = "subProj 1875"

    buildType(subProj_bt_1875_3)
    buildType(subProj_bt_1875_4)
    buildType(subProj_bt_1875_1)
    buildType(subProj_bt_1875_2)
    buildType(subProj_bt_1875_0)
    buildType(subProj_bt_1875_5)
})
