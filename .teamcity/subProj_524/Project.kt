package subProj_524

import subProj_524.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_524")
    name = "subProj 524"

    buildType(subProj_bt_524_5)
    buildType(subProj_bt_524_4)
    buildType(subProj_bt_524_3)
    buildType(subProj_bt_524_2)
    buildType(subProj_bt_524_1)
    buildType(subProj_bt_524_0)
})
