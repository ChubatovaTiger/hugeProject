package subProj_1374

import subProj_1374.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1374")
    name = "subProj 1374"

    buildType(subProj_bt_1374_3)
    buildType(subProj_bt_1374_4)
    buildType(subProj_bt_1374_5)
    buildType(subProj_bt_1374_0)
    buildType(subProj_bt_1374_1)
    buildType(subProj_bt_1374_2)
})
