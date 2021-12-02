package subProj_803

import subProj_803.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_803")
    name = "subProj 803"

    buildType(subProj_bt_803_1)
    buildType(subProj_bt_803_2)
    buildType(subProj_bt_803_3)
    buildType(subProj_bt_803_4)
    buildType(subProj_bt_803_5)
    buildType(subProj_bt_803_0)
})
