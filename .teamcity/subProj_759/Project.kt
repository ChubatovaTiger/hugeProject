package subProj_759

import subProj_759.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_759")
    name = "subProj 759"

    buildType(subProj_bt_759_5)
    buildType(subProj_bt_759_2)
    buildType(subProj_bt_759_1)
    buildType(subProj_bt_759_4)
    buildType(subProj_bt_759_3)
    buildType(subProj_bt_759_0)
})
