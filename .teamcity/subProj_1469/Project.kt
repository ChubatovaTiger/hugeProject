package subProj_1469

import subProj_1469.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1469")
    name = "subProj 1469"

    buildType(subProj_bt_1469_4)
    buildType(subProj_bt_1469_5)
    buildType(subProj_bt_1469_2)
    buildType(subProj_bt_1469_3)
    buildType(subProj_bt_1469_0)
    buildType(subProj_bt_1469_1)
})
