package subProj_1390

import subProj_1390.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1390")
    name = "subProj 1390"

    buildType(subProj_bt_1390_0)
    buildType(subProj_bt_1390_2)
    buildType(subProj_bt_1390_1)
    buildType(subProj_bt_1390_4)
    buildType(subProj_bt_1390_3)
    buildType(subProj_bt_1390_5)
})
