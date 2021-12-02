package subProj_1861

import subProj_1861.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1861")
    name = "subProj 1861"

    buildType(subProj_bt_1861_4)
    buildType(subProj_bt_1861_5)
    buildType(subProj_bt_1861_2)
    buildType(subProj_bt_1861_3)
    buildType(subProj_bt_1861_0)
    buildType(subProj_bt_1861_1)
})
