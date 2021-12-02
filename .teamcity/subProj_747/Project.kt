package subProj_747

import subProj_747.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_747")
    name = "subProj 747"

    buildType(subProj_bt_747_2)
    buildType(subProj_bt_747_3)
    buildType(subProj_bt_747_4)
    buildType(subProj_bt_747_5)
    buildType(subProj_bt_747_0)
    buildType(subProj_bt_747_1)
})
