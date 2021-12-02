package subProj_522

import subProj_522.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_522")
    name = "subProj 522"

    buildType(subProj_bt_522_5)
    buildType(subProj_bt_522_4)
    buildType(subProj_bt_522_3)
    buildType(subProj_bt_522_2)
    buildType(subProj_bt_522_1)
    buildType(subProj_bt_522_0)
})
