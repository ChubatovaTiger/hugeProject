package subProj_906

import subProj_906.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_906")
    name = "subProj 906"

    buildType(subProj_bt_906_5)
    buildType(subProj_bt_906_3)
    buildType(subProj_bt_906_4)
    buildType(subProj_bt_906_1)
    buildType(subProj_bt_906_2)
    buildType(subProj_bt_906_0)
})
