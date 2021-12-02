package subProj_1979

import subProj_1979.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1979")
    name = "subProj 1979"

    buildType(subProj_bt_1979_5)
    buildType(subProj_bt_1979_4)
    buildType(subProj_bt_1979_1)
    buildType(subProj_bt_1979_0)
    buildType(subProj_bt_1979_3)
    buildType(subProj_bt_1979_2)
})
