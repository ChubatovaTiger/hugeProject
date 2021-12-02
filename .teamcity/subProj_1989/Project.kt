package subProj_1989

import subProj_1989.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1989")
    name = "subProj 1989"

    buildType(subProj_bt_1989_0)
    buildType(subProj_bt_1989_5)
    buildType(subProj_bt_1989_2)
    buildType(subProj_bt_1989_1)
    buildType(subProj_bt_1989_4)
    buildType(subProj_bt_1989_3)
})
