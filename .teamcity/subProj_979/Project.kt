package subProj_979

import subProj_979.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_979")
    name = "subProj 979"

    buildType(subProj_bt_979_3)
    buildType(subProj_bt_979_4)
    buildType(subProj_bt_979_1)
    buildType(subProj_bt_979_2)
    buildType(subProj_bt_979_5)
    buildType(subProj_bt_979_0)
})
