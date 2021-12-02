package subProj_798

import subProj_798.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_798")
    name = "subProj 798"

    buildType(subProj_bt_798_4)
    buildType(subProj_bt_798_5)
    buildType(subProj_bt_798_2)
    buildType(subProj_bt_798_3)
    buildType(subProj_bt_798_0)
    buildType(subProj_bt_798_1)
})
