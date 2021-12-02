package subProj_989

import subProj_989.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_989")
    name = "subProj 989"

    buildType(subProj_bt_989_4)
    buildType(subProj_bt_989_5)
    buildType(subProj_bt_989_2)
    buildType(subProj_bt_989_3)
    buildType(subProj_bt_989_0)
    buildType(subProj_bt_989_1)
})
