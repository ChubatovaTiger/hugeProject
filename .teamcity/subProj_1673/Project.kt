package subProj_1673

import subProj_1673.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1673")
    name = "subProj 1673"

    buildType(subProj_bt_1673_0)
    buildType(subProj_bt_1673_3)
    buildType(subProj_bt_1673_4)
    buildType(subProj_bt_1673_1)
    buildType(subProj_bt_1673_2)
    buildType(subProj_bt_1673_5)
})
