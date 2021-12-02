package subProj_1466

import subProj_1466.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1466")
    name = "subProj 1466"

    buildType(subProj_bt_1466_5)
    buildType(subProj_bt_1466_3)
    buildType(subProj_bt_1466_4)
    buildType(subProj_bt_1466_1)
    buildType(subProj_bt_1466_2)
    buildType(subProj_bt_1466_0)
})
