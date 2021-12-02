package subProj_1968

import subProj_1968.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1968")
    name = "subProj 1968"

    buildType(subProj_bt_1968_4)
    buildType(subProj_bt_1968_5)
    buildType(subProj_bt_1968_0)
    buildType(subProj_bt_1968_1)
    buildType(subProj_bt_1968_2)
    buildType(subProj_bt_1968_3)
})
