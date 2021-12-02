package subProj_968

import subProj_968.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_968")
    name = "subProj 968"

    buildType(subProj_bt_968_2)
    buildType(subProj_bt_968_1)
    buildType(subProj_bt_968_4)
    buildType(subProj_bt_968_3)
    buildType(subProj_bt_968_5)
    buildType(subProj_bt_968_0)
})
