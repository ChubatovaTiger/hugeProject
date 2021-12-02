package subProj_594

import subProj_594.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_594")
    name = "subProj 594"

    buildType(subProj_bt_594_4)
    buildType(subProj_bt_594_5)
    buildType(subProj_bt_594_2)
    buildType(subProj_bt_594_3)
    buildType(subProj_bt_594_0)
    buildType(subProj_bt_594_1)
})
