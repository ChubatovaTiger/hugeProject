package subProj_92

import subProj_92.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_92")
    name = "subProj 92"

    buildType(subProj_bt_92_4)
    buildType(subProj_bt_92_3)
    buildType(subProj_bt_92_2)
    buildType(subProj_bt_92_1)
    buildType(subProj_bt_92_5)
    buildType(subProj_bt_92_0)
})
