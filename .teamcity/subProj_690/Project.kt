package subProj_690

import subProj_690.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_690")
    name = "subProj 690"

    buildType(subProj_bt_690_0)
    buildType(subProj_bt_690_1)
    buildType(subProj_bt_690_2)
    buildType(subProj_bt_690_3)
    buildType(subProj_bt_690_4)
    buildType(subProj_bt_690_5)
})
