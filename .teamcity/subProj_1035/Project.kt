package subProj_1035

import subProj_1035.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1035")
    name = "subProj 1035"

    buildType(subProj_bt_1035_5)
    buildType(subProj_bt_1035_1)
    buildType(subProj_bt_1035_2)
    buildType(subProj_bt_1035_3)
    buildType(subProj_bt_1035_4)
    buildType(subProj_bt_1035_0)
})
